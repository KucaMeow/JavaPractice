package frstlesson.iterator;

import java.util.*;
import java.util.stream.Collectors;

public class KladrTree implements Iterable<Node> {

    private int size = 0;
    private Node root = new Node("World", 0, (byte) 0);

    public int getSize () {
        return size;
    }

    public void remove (String name, int level) {
        Node nodeToDelete = find(name, level);
        if(nodeToDelete != null) {
            nodeToDelete.parent.children.remove(nodeToDelete);
        }
    }

    public Node find (String name, int level) {
        Node node = null;
        IteratorDFS iteratorDFS = new IteratorDFS();
        while (iteratorDFS.hasNext()) {
            Node temp = iteratorDFS.next();
            if(temp.level == level && temp.name.equals(name)) {
                node = temp;
                break;
            }
        }
        return node;
    }

    public Node findByAddress (String address) {
        String[] elems = address.split(",");

        IteratorBFS iteratorBFS = new IteratorBFS();
        while (iteratorBFS.hasNext()) {
            Node temp = iteratorBFS.next();
            Node parent = temp;
            boolean correct = true;
            for(int i = elems.length-1; i > 0; i--) {
                if(parent.name.equals(elems[i])) {
                    parent = parent.parent;
                }
                else {
                    correct = false;
                    break;
                }
            }
            if (correct) {
                return temp;
            }
        }
        return null;
    }

    public void add(String name, int level, byte priority) {
        Node n = new Node(name, level, priority);

    }

    @Override
    public Iterator<Node> iterator() {
        return new IteratorBFS();
    }

    private class IteratorBFS implements Iterator<Node> {

        private Queue<Node> queue;

        public IteratorBFS () {
            queue = new LinkedList<>();
            queue.add(root);
        }

        @Override
        public boolean hasNext() {
            return queue.isEmpty();
        }

        @Override
        public Node next() {
            queue.addAll(queue.peek().children);
            return queue.poll();
        }
    }

    private class IteratorDFS implements Iterator<Node> {

        private Stack<Node> stack;

        public IteratorDFS() {
            stack = new Stack<>();
            stack.push(root);
        }

        @Override
        public boolean hasNext() {
            return stack.isEmpty();
        }

        @Override
        public Node next() {
            Node node = stack.pop();
            if (node.children != null) {
                for (Node child : node.children) {
                    if (child != null) {
                        stack.push(child);
                    }
                }
            }
            return node;
        }
    }

    private class IteratorPriority implements Iterator<Node> {

        private Queue<Node> queue;

        public IteratorPriority() {
            queue = new LinkedList<>();
            queue.add(root);
        }

        @Override
        public boolean hasNext() {
            return queue.isEmpty();
        }

        @Override
        public Node next() {
            queue.addAll(queue.peek().children.stream()
                    .sorted((o1, o2) -> o2.priority - o1.priority).collect(Collectors.toList()));
            return queue.poll();
        }
    }
}
