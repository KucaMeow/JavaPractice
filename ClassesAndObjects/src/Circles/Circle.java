package Circles;

import Squares.Line;
import Squares.Square;

public class Circle extends Squares.Line {
    private int x, y;
    private String lineName = "None";

    public Circle(){
        System.out.println("Radius equals to line length (default 10)");
        this.setLength(10);
    }
    public Circle(int a){
        this.setLength(a);
        System.out.println("Radius equals to line length (this line length = " + this.getLength() + ")");
    }
    public Circle(int x, int y, int a){
        this.setLength(a);
        System.out.println("Radius equals to line length (this line length = " + this.getLength() + ")");

        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setLength(Line line){
        this.lineName = line.getClass().getName();
        setLength(line.getLength());
    }

    public String getLineName() {
        return lineName;
    }
    public void setStartPos(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double square(){
        return 3.14*this.getLength()*this.getLength();
    }

    public void writeSquare(){
        System.out.println(this.getClass().getName() + " square equals " + this.square());
    }


    public void writeCreatedCircle(){
        System.out.println(this.getClass().getName() + " created in x:" + this.x + " y:" + this.y);
        System.out.println(this.getClass().getName() + " has parameters of lines from " + this.getLineName() + ". Line length = " + getLength());
    }

}
