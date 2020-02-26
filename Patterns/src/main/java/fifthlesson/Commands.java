package fifthlesson;

import java.util.Arrays;

public class Commands {
    public void handleCommand(String[] command) {
        if(command[0].equals("create")) {
            Main.web.addLink(command[1]);
        }
        else if(command[0].equals("add")) {
            String link = command[1];
            String[] links = Arrays.copyOfRange(command, 2, command.length);
            Main.web.addLinksToLink(link, links);
        }
        else if(command[0].equals("goto")) {
            Main.web.goTo(command[1]);
        }
        else if(command[0].equals("link")) {
            Main.web.link(command[1]);
        }
        else if(command[0].equals("back")) {
            Main.web.back();
        }
        else if(command[0].equals("forward")) {
            Main.web.forward();
        }
        else if(command[0].equals("save")) {
            Main.web.saveStructrue();
        }
        else if(command[0].equals("load")) {
            Main.web.loadStructure();
            System.out.println(Main.web.links.toString());
        }
    }
}
