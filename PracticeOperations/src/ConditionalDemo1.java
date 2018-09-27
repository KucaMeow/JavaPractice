public class ConditionalDemo1 {
    //&& Conditional AND
    //|| Conditional OR

    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        int val1 = rand.nextInt(10), val2 = rand.nextInt(10);

        if((val1 < 5) && (val2 > 5)) System.out.println("Value1 less than 5 AND Value2 larger than 5");
        if((val1 < 5) || (val2 < 5)) System.out.println("Value1 less than 5 OR Value2 less than 5");
        else System.out.println("No match");
    }
}
