package Squares;

import java.lang.Class;

public class Box extends Square {
    public Box (){
        startZ = 0;
        this.setStartPos(0, 0);
        this.setLength(10);
    }
    private int startZ;

    public int getStartZ() {
        return startZ;
    }

    public void setStartZ(int startZ) {
        this.startZ = startZ;
    }
    public void writeCreatedBox(){
        System.out.println(this.getClass().getName() + " created in x:" + this.getStartX() + " y:" + this.getStartY() + " z:" + this.getStartZ());
        System.out.println(this.getClass().getName() + " has parameters of lines from " + this.getLineName() + ". Line length = " + getLength());
    }

    public int volume(){
        return this.getLength()*this.getLength()*this.getLength();
    }
    public void writeVolume(){
        System.out.println(this.getClass().getName() + " volume equals " + this.volume());
    }
}
