package fifthlesson;

import java.util.*;

public class Web {
    private Map<String, Set<String>> links;
    private String currentLink;
    private List<Memento> mementos;
    private int curHistoryIndex;

    public Web () {
        links = new HashMap<>();
        mementos = new ArrayList<>();
        curHistoryIndex = 0;
    }

    public void addLink (String link) {
        links.put(link, new HashSet<>());
        if(currentLink == null) {
            currentLink = link;
        }
    }
    public void addLinksToLink (String link, String[] linkArr) {
        Collections.addAll(links.get(link), linkArr);
    }
    public void goTo(String link) {
        if(!links.containsKey(link)) {
            System.out.println("No such link");
            return;
        }
        currentLink = link;
        System.out.println("Now we're on " + link);
        saveState();
    }
    public void link(String link) {
        if (links.get(currentLink).contains(link)) {
            goTo(link);
        }
        else {
            System.out.println("Can't move. Stay at " + currentLink);
        }
    }
    public void back() {
        if(curHistoryIndex > 0) {
            currentLink = mementos.get(--curHistoryIndex).getCurrentLink();
            System.out.println("We back to " + currentLink);
        }
        else {
            System.out.println("No links in history");
        }
    }
    public void forward() {
        if(curHistoryIndex < mementos.size()-1) {
            currentLink = mementos.get(++curHistoryIndex).getCurrentLink();
            System.out.println("We forward to " + currentLink);
        }
        else {
            System.out.println("No links in history");
        }
    }
    private void saveState() {
        mementos.add(curHistoryIndex, new Memento(currentLink));
        mementos = mementos.subList(0, ++curHistoryIndex);
    }
}
