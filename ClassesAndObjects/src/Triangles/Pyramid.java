package Triangles;

public class Pyramid extends Triangle {
    private int z, heigh;
    public Pyramid(int x, int y, int a, int b, int c, int d){
        this.setSides(a, b, c);
        this.heigh = d;
        this.setStartPos(x, y);
    }
    public Pyramid(int a, int b, int c, int d){
        this.setSides(a, b, c);
        this.heigh = d;
    }
    public Pyramid(){
        this.setSides(10, 10, 10);
        this.heigh = 10;
    }

    void setStartPos(int x, int y, int z){
        this.setStartPos(x, y);
        this.z = z;
    }
    public void writeCreatedPyramid(){
        System.out.println(this.getClass().getName() + " created with center in x:" + this.getX() + " y:" + this.getY() + " z: " + this.z);
    }


    public double volume(){
        double p = (this.getSide1() + this.getSide2() + this.getSide3())/2;
        return (1/3)*heigh*Math.sqrt(p*(p - this.getSide3())*(p - this.getSide2())*(p - this.getSide1()));
    }

    public void writeVolume(){
        System.out.println(this.getClass().getName() + " volume equals " + this.volume());
    }
}
