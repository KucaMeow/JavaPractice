package ru.itis.container;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component("memory")
public class MemoryContainer implements Container{
    private Set<String> names;

    public MemoryContainer() {
        names = new HashSet<String>();
    }

    public void addName (String name) {
        names.add(name);
    }

    public String names () {
        return names.toString();
    }
}
