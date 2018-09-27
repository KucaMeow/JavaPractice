public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) System.out.println("Count = " + i);

        System.out.println("Enhanced for:");
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        for(int i : nums) System.out.println("Count of array = " + i);
    }
}
