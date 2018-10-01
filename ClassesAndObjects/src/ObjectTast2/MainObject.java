package ObjectTast2;

public class MainObject {
    public static void main(String[] args) {
        Point point = new Point(10, 15);
        Rectangle rec1 = new Rectangle(point, 10, 15);
        Rectangle rec2 = new Rectangle(11, 18);

        System.out.println("Width 1 = " + rec1.getWidth());
        System.out.println("Heigh 1 = " + rec1.getHeigh());
        System.out.println("Area 1 = " + rec1.getArea());
        System.out.println(rec1.curOrigin());
        rec1.setOrigin(new Point(1, 2));
        System.out.println(rec1.curOrigin());
        System.out.println();
        System.out.println("Width 2 = " + rec2.getWidth());
        System.out.println("Heigh 2 = " + rec2.getHeigh());
        System.out.println("Area 2 = " + rec2.getArea());
        System.out.println(rec2.curOrigin());
        rec2.move(1, 2);
        System.out.println(rec2.curOrigin());
    }
}
