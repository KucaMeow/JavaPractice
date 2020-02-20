package thirdlesson;

import thirdlesson.commander.Commands;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Map<Integer, Task> tasks = new HashMap<>();
    public static boolean isAdmin;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Commands c = new Commands();
        System.out.println("Are you admin?");
        isAdmin = sc.nextLine().toLowerCase().equals("yes");
        while (true) {
            c.handle(sc.nextLine());
        }
    }
}
