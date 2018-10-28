package Task7;

public class FloatAdder {
    public static void main(String[] args) {
        float summ = 0.0f;
        //System.out.printf("%.2f", summ);

        if(args.length <= 1)
            System.out.println("Error");
        else {
            for (String a : args) {
                summ += Float.parseFloat(a);
            }
            System.out.printf("%.2f", summ);
        }
    }
}
