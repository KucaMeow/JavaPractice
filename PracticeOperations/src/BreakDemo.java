public class BreakDemo {
    public static void main(String[] args) {

        int[] arrayOfInts = {32,87,3,589,12,1076,2000,8,622,127};
        int search = 12;

        int i;
        boolean found = false;

        for (i = 0; i < arrayOfInts.length; i++){
            if(arrayOfInts[i] == search){
                found = true;
                break;
            }
        }

        if(found) System.out.println("Found " + search + " at index " + i);
        else System.out.println(search + " isn't in the array");
    }
}
