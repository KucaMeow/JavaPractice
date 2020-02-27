package fifthlesson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;

public class Web {
    public Map<String, List<String>> links;
    private String currentLink;
//    private List<Memento> mementos;
    private Stack<Memento> back;
    private Stack<Memento> forward;
//    private int curHistoryIndex;
    private Theme theme;

    public Web (Theme theme) {
        links = new HashMap<>();
//        mementos = new ArrayList<>();
        back = new Stack<>();
        forward = new Stack<>();
//        curHistoryIndex = 0;
        this.theme = theme;
    }

    public void addLink (String link) {
        links.put(link, new ArrayList<>());
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
        if(!back.isEmpty()) {
//            currentLink = mementos.get(--curHistoryIndex).getCurrentLink();
            currentLink = back.peek().getCurrentLink();
            forward.push(back.pop());
            System.out.println("We back to " + currentLink);
        }
        else {
            System.out.println("No links in history");
        }
    }
    public void forward() {
        if(!forward.isEmpty()) {
//            currentLink = mementos.get(++curHistoryIndex).getCurrentLink();
            currentLink = forward.peek().getCurrentLink();
            back.push(forward.pop());
            System.out.println("We forward to " + currentLink);
        }
        else {
            System.out.println("No links in history");
        }
    }
    private void saveState() {
//        mementos.add(curHistoryIndex, new Memento(currentLink));
//        mementos = mementos.subList(0, ++curHistoryIndex);
        if(!forward.isEmpty()) back.push(forward.pop());
        forward = new Stack<>();
        forward.push(new Memento(currentLink));
    }

    public void saveStructrue () {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("web.web"));
            pw.println((new ObjectMapper()).writeValueAsString(links));
            pw.flush();
            pw.close();
        } catch (FileNotFoundException | JsonProcessingException e) {
            throw new IllegalStateException(e);
        }
    }
    public void loadStructure () {
        try {
            links = (new ObjectMapper()).readValue(new File("web.web"), links.getClass());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
    public void showTheme () {
        theme.whichTheme();
    }
}
