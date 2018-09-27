public class ContinueDemo {
    public static void main(String[] args) {
            String str = "abcdefghijklmpooopqrstuvwxyz";
            int max = str.length();
            int numOs = 0;

            for(int i = 0; i < max; i++){
                if(str.charAt(i) != 'o') continue;
                numOs++;
            }

            System.out.println("Found " + numOs + " o's in the string");
        }
}
