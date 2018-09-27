package Squares;

public class Line {
    public Line(){
        length = 10;
    }
    public Line(int a){
        length = a;
    }
    private int length = 0;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void writeCreatedLine(){
        System.out.println(this.getClass().getName() + " created with length " + this.getLength());
    }
}
