package frstlesson.iterator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Node {
    List<Node> children;
    String name;
    int level;
    byte priority;
    @JsonIgnore
    Node parent;

    void addChild(Node node) {
        children.add(node);
    }

    public static Builder builder() {
        return new Builder();
    }

    private Node(Node parent, List<Node> children, String name, int level, byte priority) {
        this.parent = parent;
        this.children = children;
        this.name = name;
        this.level = level;
        this.priority = priority;
    }

    public Node(String name, int level, byte priority) {
        children = new ArrayList<>();
        this.name = name;
        this.level = level;
        this.priority = priority;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    /**
     * BUILDER
     */
    public static class Builder {
        Node parent;
        List<Node> children;
        String name;
        int level;
        byte priority;

        private Builder() {}

        public Builder parent(Node parent) {
            this.parent = parent;
            return this;
        }
        public Builder children(List<Node> children) {
            this.children = children;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder level(int level) {
            this.level = level;
            return this;
        }
        public Builder priority(byte priority) {
            this.priority = priority;
            return this;
        }
        public Node build() {
            return new Node(parent, children, name, level, priority);
        }
    }
}

