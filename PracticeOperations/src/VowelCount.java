public class VowelCount {
    public static void main(String[] args) {
        String str = "This is any string with any count of Vowels";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            switch (a){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'u':
                case 'U':
                case 'o':
                case 'O': count++;
                    System.out.println(a);
                    break;
                case 'y':
                case 'Y': if(i != 0) {
                    count++;
                    System.out.println(a);
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
