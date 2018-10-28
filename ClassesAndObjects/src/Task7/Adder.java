package Task7;

public class Adder {
    public static void main(String[] args) {
        int summ = 0;
        if (args.length <= 1) System.out.println("Error");
        else {
            for (String a : args) {
                summ += Integer.parseInt(a);
            }
            System.out.println(summ);
        }
    }
}
