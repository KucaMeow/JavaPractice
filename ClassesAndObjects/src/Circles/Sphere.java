package Circles;

public class Sphere extends Circle {
    private int z;

    public void setStartPos(int x, int y, int z){
        this.setStartPos(x, y);
        this.z = z;
    }
    public int getZ(){
        return z;
    }
    public double volume(){
        return 3.14*(4/3)*this.getLength()*this.getLength()*this.getLength();
    }
    public void writeVolume(){
        System.out.println(this.getClass().getName() + " volume equals " + this.volume());
    }
    public void writeCreatedSphere(){
        System.out.println(this.getClass().getName() + " created in x:" + this.getX() + " y:" + this.getY() + " z:" + this.getZ());
        System.out.println(this.getClass().getName() + " has parameters of lines from " + this.getLineName() + ". Line length = " + getLength());
    }
}
