public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        //3
        i++;
        //4
        System.out.println(i);

        ++i;
        //5
        System.out.println(i);

        System.out.println(++i);
        //print 6

        System.out.println(i++);
        //print 6, i -> 7

        System.out.println(i);
    }
}
