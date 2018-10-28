package Task7;

public class Anagram {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Wrong in");
            return;
        }
        //String first = args[0];
        char [] a = args[0].toCharArray();
        //String second = args[1];
        char [] b = args[1].toCharArray();

        if(args[0].length() != args[1].length()) return;
        int count = 0;
        for (char anA : a) {
            for (int j = 0; j < a.length; j++) {
                if (anA == b[j]) {
                    b[j] = '\0';
                    count++;
                    break;
                }
            }
        }
        System.out.println(count == a.length);
    }
}
