public class ConditionalDemo2 {
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        int val1 = rand.nextInt(10), val2 = rand.nextInt(10), val3 = rand.nextInt(1);
        int result;

        boolean someCondition = (val3 == 1);
        result = someCondition ? val1 : val2;

        System.out.println(result);
        System.out.println((result == val1) ? "val1" : "val2");
    }
}
