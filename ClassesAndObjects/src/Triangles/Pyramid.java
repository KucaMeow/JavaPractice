package Triangles;

public class Pyramid extends Triangle {
    private int z, heigh;
    public Pyramid(int x, int y, int a, int b, int c, int d){
        side1 = a;
        side2 = b;
        side3 = c;
        heigh = d;
        x = x;
        y = y;
    }
    public Pyramid(int a, int b, int c, int d){
        side1 = a;
        side2 = b;
        side3 = c;
        heigh = d;
    }
    public Pyramid(){
        side1 = 10;
        side2 = 10;
        side3 = 10;
        heigh = 10;
    }

    void setStartPos(int x, int y, int z){
        x = x;
        y = y;
        z = z;
    }
    public void writeCreatedPyramid(){
        System.out.println(this.getClass().getName() + " created with center in x:" + this.x + " y:" + this.y + " z: " + this.z);
    }


    public double volume(){
        double p = (side1 + side2 + side3)/2;
        return (1/3)*heigh*Math.sqrt(p*(p-side3)*(p-side2)*(p-side1));
    }

    public void writeVolume(){
        System.out.println(this.getClass().getName() + " volume equals " + this.volume());
    }
}
