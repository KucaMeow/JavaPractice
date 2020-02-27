package fifthlesson.webs;

import fifthlesson.bridge.Theme;

import java.util.Arrays;

public class SlowWeb extends Web {
    public SlowWeb(Theme theme) {
        super(theme);
        System.out.println("I'm slow :C");
    }

    @Override
    public void addLink(String link) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("Slowly added link " + link);
        super.addLink(link);
    }

    @Override
    public void addLinksToLink(String link, String[] linkArr) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("Slowly added links " + Arrays.toString(linkArr));
        super.addLinksToLink(link, linkArr);
    }

    @Override
    public void goTo(String link) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("Slowly go to " + link);
        super.goTo(link);
    }

    @Override
    public void link(String link) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("Slowly linked to " + link);
        super.link(link);
    }

    @Override
    public void back() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("Slowly backed");
        super.back();
    }

    @Override
    public void forward() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("Slowly forwarded");
        super.forward();
    }

    @Override
    public void saveStructrue() {
        super.saveStructrue();
    }

    @Override
    public void loadStructure() {
        super.loadStructure();
    }
}
