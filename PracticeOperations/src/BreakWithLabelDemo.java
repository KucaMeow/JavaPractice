public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] arr ={
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };

        int search = 12;
        int i, j = 0;

        boolean found = false;
        search:
            for (i = 0; i < arr.length; i++){
                for(j = 0; j < arr[i].length; j++){
                    if(arr[i][j] == search){
                        found = true;
                        break search;
                    }
                }
            }
        if(found) System.out.println("Found " + search + " at " + i + ", " + j);
        else System.out.println("Can't find " + search);
    }
}
