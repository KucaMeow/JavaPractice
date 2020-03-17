package ru.itis.container;

import org.springframework.stereotype.Component;

import java.io.*;

public class FileContainer implements Container{
    private File file;

    public FileContainer() {
        file = new File("names.txt");
    }

    public void addName(String name) {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(file, true), true);
            pw.println(name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String names() {
        StringBuilder names = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String temp;
            while ((temp = br.readLine()) != null) {
                names.append(temp).append(", ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return names.toString();
    }
}
