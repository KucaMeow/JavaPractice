package Triangles;

public class Triangle {
    private int side1, side2, side3, x, y;

    public Triangle(int x, int y, int a, int b, int c){
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
        this.x = x;
        this.y = y;
    }
    public Triangle(int a, int b, int c){
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }
    public Triangle(){
        this.side1 = 10;
        this.side2 = 10;
        this.side3 = 10;
    }

    void setSides(int a, int b, int c){
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }

    public int getSide1() {
        return this.side1;
    }
    public int getSide2() {
        return this.side2;
    }
    public int getSide3() {
        return this.side3;
    }

    public double square(){
        double p = (this.side1 + this.side2 + this.side3)/2;
        return Math.sqrt(p*(p-this.side3)*(p-this.side2)*(p-this.side1));
    }
    public void setStartPos(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void writeSquare(){
        System.out.println(this.getClass().getName() + " square equals " + this.square());
    }
    public void writeCreatedTriangle(){
        System.out.println(this.getClass().getName() + " created with center in x:" + this.x + " y:" + this.y);
    }
}
