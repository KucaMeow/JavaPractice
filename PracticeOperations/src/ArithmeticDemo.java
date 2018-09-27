public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 2 + 3;
        //result = 5
        System.out.println("2 + 3 = " + result);

        int orig_result = result;
        result = result - 1;
        //result = 4
        System.out.println(orig_result + " - 1 = " + result);

        orig_result = result;
        result = result * 2;
        //result = 8
        System.out.println(orig_result + " * 2 = " + result);

        orig_result = result;
        result = result / 2;
        //result = 4
        System.out.println(orig_result + " / 2 = " + result);

        orig_result = result;
        result = result + 7;
        //result = 11
        System.out.println(orig_result + " + 7 = " + result);

        orig_result = result;
        result = result % 5;
        //result = 1
        System.out.println(orig_result + " % 5 = " + result);
    }
}
