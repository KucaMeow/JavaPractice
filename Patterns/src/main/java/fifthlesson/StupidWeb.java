package fifthlesson;

import java.util.Random;

public class StupidWeb extends Web {
    public StupidWeb(Theme theme) {
        super(theme);
        System.out.println("I'm stupid web");
    }

    @Override
    public void forward() {
        if((new Random().nextInt(100) > 50))
            System.out.println("I can't go forward, don't touch me!");
        else
            super.forward();
    }

    @Override
    public void goTo(String link) {
        if((new Random().nextInt(100) > 50))
            System.out.println("I can't goto!!!");
        else
            super.goTo(link);
    }
}
