package Task7;

public class Calculator {
    private static int summ (int a, int b){
        return a + b;
    }
    private static int sub (int a, int b){
        return a - b;
    }
    private static int mult (int a, int b){
        return a * b;
    }
    private static int div (int a, int b){
        return a / b;
    }

    public static void main(String[] args) {

        if(args.length != 3) System.out.println("Wrong in");
        else {
            switch (args[1]) {
                case "+":
                    System.out.println("= " + summ(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
                    break;
                case "-":
                    System.out.println("= " + sub(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
                    break;
                case "/":
                    System.out.println("= " + div(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
                    break;
                case "*":
                    System.out.println("= " + mult(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
                    break;
                default:
                    System.out.println("Wrong in");
                    break;
            }
        }

    }

}
