public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String search = "Look for a substring in me", substring = "sub";
        boolean found = false;

        int max = search.length() - substring.length();

        test:
            for(int i = 0; i <= max; i++){
                int n = substring.length();
                int j = i;
                int k = 0;
                while (n-- != 0){
                    if(search.charAt(j++) != substring.charAt(k++)){
                        continue test;
                    }
                }
                found = true;
                break test;
            }
        System.out.println(found ? "Found it" : "Didn't find it");
    }
}
