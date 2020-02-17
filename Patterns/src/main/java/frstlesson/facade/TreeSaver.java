package frstlesson.facade;

import frstlesson.iterator.KladrTree;

public interface TreeSaver {
    public void save (KladrTree tree);
    public KladrTree load ();
}
