package ru.itis.interpretators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.itis.Main;
import ru.itis.container.Container;

@Component("commander")
public class Interpretator {

    private Container container;
    private boolean configured = false;

    public void handleCommand(String command) {
        String[] parts = command.split(" ");

        if(parts[0].equals("add")) {
            if(!configured) {
                System.out.println("Config container!");
                return;
            }
            container.addName(parts[1]);
            System.out.println("Name " + parts[1] + " was added");
        }
        else if (parts[0].equals("out")) {
            if(!configured) {
                System.out.println("Config container!");
                return;
            }
            System.out.println(container.names());
        }
        else if (parts[0].equals("stop")) {
            if(!configured) {
                System.out.println("Config container!");
                return;
            }
            Main.work = false;
        }
        else if (parts[0].equals("config")) {
            if(parts[1].equals("file")) {
                container = (Container) Main.context.getBean("file");
            }
            else if(parts[1].equals("memory")) {
                container = (Container) Main.context.getBean("memory");
            }
            else {
                return;
            }
            configured = true;
        }
        else {
            System.out.println("No such command");
        }
    }
}
