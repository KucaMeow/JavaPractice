package frstlesson.singleton;

import frstlesson.facade.TreeSaver;
import frstlesson.facade.TreeSaverJson;

public class TreeSaverSingleton {
    private static TreeSaver treeSaver;

    public static TreeSaver getInstance() {
        if(treeSaver == null) {
            treeSaver = new TreeSaverJson();
        }
        return treeSaver;
    }
}
