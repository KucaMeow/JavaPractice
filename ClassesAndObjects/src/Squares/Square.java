package Squares;

public class Square extends Line {
    private int startX, startY;
    private String lineName = "None";

    public Square(int startX, int startY, int length) {
        this.startX = startX;
        this.startY = startY;
        this.setLength(length);
    }
    public Square(){
        this.startY = 0;
        this.startX = 0;
        this.setLength(10);
    }

    public void setStartPos(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setLength(Line line){
        this.lineName = line.getClass().getName();
        setLength(line.getLength());
    }

    public String getLineName() {
        return lineName;
    }
    public void writeCreatedSquare(){
        System.out.println(this.getClass().getName() + " created in x:" + this.getStartX() + " y:" + this.getStartY());
        System.out.println(this.getClass().getName() + " has parameters of lines from " + this.getLineName() + ". Line length = " + getLength());
    }

    public int square(){
        return this.getLength()*this.getLength();
    }
    public void writeSquare(){
        System.out.println(this.getClass().getName() + " square equals " + this.square());
    }
}
