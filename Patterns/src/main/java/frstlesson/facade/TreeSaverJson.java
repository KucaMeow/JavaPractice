package frstlesson.facade;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import frstlesson.iterator.KladrTree;
import frstlesson.iterator.Node;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

public class TreeSaverJson implements TreeSaver{


    public void save(KladrTree tree) {
        try {
            PrintWriter pw = new PrintWriter("kladr.json");
            pw.println((new ObjectMapper()).writeValueAsString(tree));
            pw.flush();
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public KladrTree load() {
        KladrTree tree;
        try {
            tree = (new ObjectMapper()).readValue (new File("kladr.json"), KladrTree.class);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        Iterator<Node> it = tree.iterator();
        while (it.hasNext()) {
            Node p = it.next();
            for(Node n : p.getChildren()) {
                n.setParent(p);
            }
        }
        return tree;
    }
}
