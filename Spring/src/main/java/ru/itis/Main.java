package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itis.interpretators.Interpretator;

import java.util.Scanner;

public class Main {
    public static boolean work = true;
    public static ApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext("ru.itis");
        Interpretator commander = (Interpretator) context.getBean("commander");
        Scanner sc = new Scanner(System.in);
        while (work) {
            commander.handleCommand(sc.nextLine());
        }
    }
}
