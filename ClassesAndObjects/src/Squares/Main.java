package Squares;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line();
        line1.setLength(10);
        line1.writeCreatedLine();


        Square square1 = new Square();
        square1.setLength(10);
        square1.setStartPos(0, 0);
        square1.writeCreatedSquare();
        square1.writeSquare();

        Box box1 = new Box();
        box1.setStartPos(0, 0);
        box1.setStartZ(1);
        box1.setLength(20);
        box1.writeCreatedBox();
        box1.writeVolume();

        Square square2 = new Square();
        square2.setLength(line1);
        square2.writeCreatedSquare();

        Square square3 = new Square(0, 0, 20);
        square3.writeCreatedSquare();
    }
}
