public class UnaryDemo {
    public static void main(String[] args) {
        int result = +1;
        //result = 1
        System.out.println(result);

        result--;
        //result = 0
        System.out.println(result);

        result++;
        //result = 1
        System.out.println(result);

        result = -result;
        //result = -1
        System.out.println(result);

        boolean success = false;
        //false
        System.out.println(success);
        //true
        System.out.println(!success);
    }
}
