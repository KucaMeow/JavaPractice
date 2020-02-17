package frstlesson.facade;

import frstlesson.iterator.KladrTree;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TreeSaverXML implements TreeSaver{
    @Override
    public void save(KladrTree tree) {
        try {
            XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream("kladr.xml"));
            xmlEncoder.writeObject(tree);
            xmlEncoder.flush();
            xmlEncoder.close();
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public KladrTree load() {
        try {
            XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("kladr.xml"));
            return (KladrTree) xmlDecoder.readObject();
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
