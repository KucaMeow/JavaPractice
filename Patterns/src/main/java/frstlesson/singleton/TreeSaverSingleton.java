package frstlesson.singleton;

import frstlesson.facade.TreeSaver;
import frstlesson.facade.TreeSaverJson;

public class TreeSaverSingleton {
    TreeSaver treeSaver;

    public TreeSaver TreeSaver() {
        if(treeSaver == null) {
            treeSaver = new TreeSaverJson();
        }
        return treeSaver;
    }
}
