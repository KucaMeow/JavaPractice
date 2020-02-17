package frstlesson.interpritator;

import frstlesson.iterator.KladrTree;
import frstlesson.iterator.Node;

import java.util.ArrayList;
import java.util.List;

public class Commands {

    private KladrTree kt;

    public Commands(KladrTree kt) {
        this.kt = kt;
    }

    public void handleCommand (String command) {
        String[] elems = command.split(" ");
        if(elems[0].equals("return")) {
            if(elems[1].equals("children")) {
                getChildren(elems[3], Integer.parseInt(elems[2]));
                //Что-то делаем??
            }
            if(elems[1].equals("node")) {
                getNode(elems[3], Integer.parseInt(elems[2]));
                //Что-то делаем??
            }
        }
        else if(elems[0].equals("add")) {
            Node parent = kt.findByAddress(elems[1]);
            if(parent == null) {
                System.out.println("Нет такой ноды");
                return;
            }
            Node.builder()
                    .parent(parent)
                    .children(new ArrayList<>())
                    .name(elems[2])
                    .level(Integer.parseInt(elems[3]))
                    .priority(Byte.parseByte(elems[4]))
                    .build();
        }
        else if(elems[0].equals("delete")) {
            Node nodeToDelete = kt.findByAddress(elems[1]);
            if(nodeToDelete == null) {
                System.out.println("Нет такой ноды");
                return;
            }
            nodeToDelete.getParent().getChildren().remove(nodeToDelete);
        }
    }

    private Node getNode (String name, int level) {
        return kt.find(name, level);
    }
    private List<Node> getChildren (String name, int level) {
        return getNode(name, level).getChildren();
    }
}
