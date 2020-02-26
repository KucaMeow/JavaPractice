package fifthlesson;

import java.util.Scanner;

public class Main {
    public static Web web;

    public static void main(String[] args) {
        web = new Web();
        Commands c = new Commands();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            c.handleCommand(sc.nextLine().split(" "));
        }
    }
}
