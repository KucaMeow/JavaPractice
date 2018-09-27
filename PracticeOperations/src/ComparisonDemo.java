public class ComparisonDemo {
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        int val1 = rand.nextInt(10), val2 = rand.nextInt(10);
        //val1 & val2 [0, 9]
        System.out.println("=========================");
        System.out.println(val1);
        System.out.println(val2);
        System.out.println();
        System.out.println("COMPARISON");
        System.out.println("=========================");

        if(val1 == val2) System.out.println("Value 1 == Value2");
        if(val1 != val2) System.out.println("Value 1 != Value2");
        if(val1 > val2) System.out.println("Value 1 > Value2");
        if(val1 < val2) System.out.println("Value 1 < Value2");
        if(val1 >= val2) System.out.println("Value 1 >= Value2");
        if(val1 <= val2) System.out.println("Value 1 <= Value2");
    }
}
