package Task5;
import java.util.*;

public class StringTest {
    public static void main(String[] args) {
        String test = "Test string";
        upperCase(test);
        System.out.println();
        mirror(test);
        System.out.println();
        test(test);
        System.out.println();
        mmToCm();
        System.out.println();
        mmToM();
        System.out.println();
        mmToIn();
        System.out.println();
    }

    static void upperCase(String str){
        for (int i = 0; i < str.length(); i++){
            String out;
            if(i%2 == 0) {
                out = "" + str.charAt(i);
                System.out.print(out.toUpperCase());
            }
            if(i%2 == 1) {
                out = "" + str.charAt(i);
                System.out.print(out.toLowerCase());
            }
        }
        System.out.println();
    }

    static void mmToCm(){
        System.out.println("Write <num mm> to convert into cm");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if(a.endsWith(" mm")){
            int b = Integer.parseInt(a.substring(0, a.indexOf(" mm")));
            System.out.println("" + 1.0*b/10 + " cm");
        }
    }
    static void mmToM(){
        System.out.println("Write <num mm> to convert into m");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if(a.endsWith(" mm")){
            int b = Integer.parseInt(a.substring(0, a.indexOf(" mm")));
            System.out.println("" + 1.0*b/1000 + " m");
        }
    }
    static void mmToIn(){
        System.out.println("Write <num mm> to convert into in");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if(a.endsWith(" mm")){
            int b = Integer.parseInt(a.substring(0, a.indexOf(" mm")));
            System.out.println("" + 1.0*b/25.4 + " in");
        }
    }

    static void mirror(String str){
        for (int i = str.length() - 1; i >= 0; i--) System.out.print(str.charAt(i));
        System.out.println();
    }

    static void test(String string){
        System.out.println("It's replacer from a to A:");
        System.out.println(string.replace('a', 'A'));
        System.out.println();

        System.out.println("It's replacer spaces to word spaces to 'SPACE'");
        System.out.println(string.replaceAll(" ", "SPACE"));
        System.out.println();

        System.out.println("It's substract apple from string Fresh apple");
        String str = "Fresh apple";
        System.out.println(str.substring(str.indexOf("apple")));
        System.out.println();
    }


}
