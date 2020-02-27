package fifthlesson.webs;

import fifthlesson.bridge.Theme;

import java.util.Random;

public class VirusedWeb extends Web{
    public VirusedWeb(Theme theme) {
        super(theme);
    }

    private void showAdd() {
        switch (new Random().nextInt(3)) {
            case 0:
                System.out.println("Buy very cheap Normal browser!");
                break;
            case 1:
                System.out.println("Adblocker won't help");
                break;
            case 2:
                System.out.println("Tasty cow");
            default:
                System.out.println("How have you got it?");
        }
    }

    @Override
    public void addLink(String link) {
        showAdd();
        super.addLink(link);
    }

    @Override
    public void addLinksToLink(String link, String[] linkArr) {
        showAdd();
        super.addLinksToLink(link, linkArr);
    }

    @Override
    public void goTo(String link) {
        showAdd();
        super.goTo(link);
    }

    @Override
    public void link(String link) {
        showAdd();
        super.link(link);
    }

    @Override
    public void back() {
        showAdd();
        super.back();
    }

    @Override
    public void forward() {
        showAdd();
        super.forward();
    }
}
