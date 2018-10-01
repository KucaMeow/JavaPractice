package ObjectTast2;

public class Rectangle extends Point{
    private int width, heigh;
    private Point origin;
    public Rectangle(Point point, int width, int heigh){
        setOrigin(point);
        this.width = width;
        this.heigh = heigh;
    }

    public Rectangle(int width, int heigh){
        this.width = width;
        this.heigh = heigh;
        setOrigin(new Point(0, 0));
    }
    public Rectangle(){ this(1, 1); }

    public int getArea(){
        return width*heigh;
    }
    public void move(int x, int y){
        this.setOrigin(new Point(origin.getX() + x, origin.getY() + y));
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public String curOrigin(){
        return "x: " + origin.getX() + " y: " + origin.getY();
    }
}
