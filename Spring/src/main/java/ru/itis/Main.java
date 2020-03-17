package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itis.config.AppContextConfig;
import ru.itis.container.Container;
import ru.itis.interpretators.Interpretator;

import java.util.Scanner;

public class Main {
    public static boolean work = true;
    public static ApplicationContext context;
    public static String containerType = "c";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String[] parts = sc.nextLine().split(" ");
//        if (parts[0].equals("config")) {
//            containerType = parts[1];
//        }
        context = new AnnotationConfigApplicationContext(AppContextConfig.class);
        Interpretator commander = context.getBean(Interpretator.class);
        while (work) {
            commander.handleCommand(sc.nextLine());
        }
    }
}
