package Chair;

public class ChairMain {
    public static void main(String[] args) {
        ChairBase myChair = new ChairBase();
        myChair.height = 12;
        myChair.width = 10;

        System.out.println("Legs count: " + myChair.getLegsCount());
        System.out.println("Height = " + myChair.getHeight());
        System.out.println("Width = " + myChair.getWidth());

        Stool myStool = new Stool();


        System.out.println(myStool.getLegsCount());

        System.out.println(myStool.isHasBack());

    }
}
