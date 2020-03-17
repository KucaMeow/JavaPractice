package ru.itis.interpretators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.itis.Main;
import ru.itis.container.Container;

@Component("commander")
public class Interpretator {

    @Qualifier("jpaContainer")
    @Autowired
    private Container container;

    public void handleCommand(String command) {
        String[] parts = command.split(" ");

        if(parts[0].equals("add")) {
            container.addName(parts[1]);
            System.out.println("Name " + parts[1] + " was added");
        }
        else if (parts[0].equals("out")) {
            System.out.println(container.names());
        }
        else if (parts[0].equals("stop")) {
            Main.work = false;
        }
        else {
            System.out.println("No such command");
        }
    }
}
