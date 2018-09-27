package Triangles;

public class Triangle {
    int side1, side2, side3, x, y;

    public Triangle(int x, int y, int a, int b, int c){
        side1 = a;
        side2 = b;
        side3 = c;
        x = x;
        y = y;
    }
    public Triangle(int a, int b, int c){
        side1 = a;
        side2 = b;
        side3 = c;
    }
    public Triangle(){
        side1 = 10;
        side2 = 10;
        side3 = 10;
    }

    void setSides(int a, int b, int c){
        side1 = a;
        side2 = b;
        side3 = c;
    }

    public int getSide1() {
        return side1;
    }
    public int getSide2() {
        return side2;
    }
    public int getSide3() {
        return side3;
    }

    public double square(){
        double p = (side1 + side2 + side3)/2;
        return Math.sqrt(p*(p-side3)*(p-side2)*(p-side1));
    }
    public void setStartPos(int x, int y){
        x = x;
        y = y;
    }

    public void writeSquare(){
        System.out.println(this.getClass().getName() + " square equals " + this.square());
    }
    public void writeCreatedTriangle(){
        System.out.println(this.getClass().getName() + " created with center in x:" + this.x + " y:" + this.y);
    }
}
