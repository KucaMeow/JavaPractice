package fifthlesson;

import fifthlesson.factory.Factory;
import fifthlesson.factory.NormalWebCreator;
import fifthlesson.factory.OldWebCreator;
import fifthlesson.factory.StrangeWebCreator;
import fifthlesson.webs.Web;

import java.util.Scanner;

public class Main {
    public static Web web;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factory f;
        switch (sc.nextLine()) {
            case "1":
                f = new NormalWebCreator();
                break;
            case "2":
                f = new StrangeWebCreator();
                break;
            case "3":
                f = new OldWebCreator();
                break;
            default:
                f = new NormalWebCreator();
        }
        web = f.createWeb();
//        web.showTheme(); //Test bridge
        Commands c = new Commands();
        while (sc.hasNext()) {
            c.handleCommand(sc.nextLine().split(" "));
        }
    }
}
