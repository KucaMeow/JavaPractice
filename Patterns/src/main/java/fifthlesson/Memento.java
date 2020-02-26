package fifthlesson;

public class Memento {
    private String currentLink;

    public Memento (String currentLink) {
        this.currentLink = currentLink;
    }

    public String getCurrentLink() {
        return currentLink;
    }
}
