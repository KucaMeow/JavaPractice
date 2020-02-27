package thirdlesson.commander;

import forthlesson.prototype.TaskBuilder;
import forthlesson.proxy.TaskInterface;
import forthlesson.proxy.TaskWithPermission;
import thirdlesson.Main;
import thirdlesson.Task;
import thirdlesson.TaskImpl;

public class Commands {

    public void handle(String nextLine) {
        String[] command = nextLine.split(" ");
        if(command[0].equals("new")) {
            if(command[1].toLowerCase().equals("task")) {
                StringBuilder desk = new StringBuilder();
                for(int i = 2; i < command.length; i++) {
                    desk.append(command[i]).append(" ");
                }
                Task t = new TaskWithPermission(desk.toString());
                Main.tasks.put(t.getId(), t);
                System.out.println(t.toString());
            }
            if(command[1].toLowerCase().equals("taskinterface")) {
                StringBuilder desk = new StringBuilder();
                for(int i = 2; i < command.length; i++) {
                    desk.append(command[i]).append(" ");
                }
                Task t = new TaskInterface(desk.toString());
                Main.tasks.put(t.getId(), t);
                System.out.println(t.toString());
            }
            //...
        }
        else if (command[0].equals("copy")) {
            int id = Integer.parseInt(command[1]);
            TaskImpl t = TaskBuilder.copy(Main.tasks.get(id).castToTaskImpl());
            if(t == null) {
                System.out.println("No such task");
                return;
            }
            System.out.println(t.toString());
        }
        else if (command[0].equals("show")) {
            int id = Integer.parseInt(command[1]);
            if(Main.tasks.get(id) == null) {
                System.out.println("No such task");
                return;
            }
            System.out.println(Main.tasks.get(id).toString());
        }
        else if(command[0].equals("up")) {
            int id = Integer.parseInt(command[1]);
            int argum = -1;
            if(command.length > 2) {
                argum = Integer.parseInt(command[2]);
            }

            Main.tasks.get(id).up(argum);
        }
        else if(command[0].equals("down")) {
            int id = Integer.parseInt(command[1]);
            StringBuilder arg = new StringBuilder();
            for(int i = 2; i < command.length; i++) {
                arg.append(command[i]).append(" ");
            }
            String argum = arg.toString();

            Main.tasks.get(id).down(argum);

        }
        else if(command[0].equals("select")) {
            //select (id = "1" and testerId = "10") or text = "hello"

        }
    }
}
