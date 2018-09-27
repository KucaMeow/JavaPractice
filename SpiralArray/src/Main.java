import java.util.Scanner;



/*
##############################################################
###############Makes spiral array with any size###############
##############################################################
              __,aaPPPPPPPPaa,__
          ,adP"""'          `""Yb,_
       ,adP'                     `"Yb,
     ,dP'     ,aadPP"""""YYba,_     `"Y,
    ,P'    ,aP"'            `""Ya,     "Y,
   ,P'    aP'     _________     `"Ya    `Yb,
  ,P'    d"    ,adP""""""""Yba,    `Y,    "Y,
 ,d'   ,d'   ,dP"            `Yb,   `Y,    `Y,
 d'   ,d'   ,d'    ,dP""Yb,    `Y,   `Y,    `b
 8    d'    d'   ,d"      "b,   `Y,   `8,    Y,
 8    8     8    d'    _   `Y,   `8    `8    `b
 8    8     8    8     8    `8    8     8     8
 8    Y,    Y,   `b, ,aP     P    8    ,P     8
 I,   `Y,   `Ya    """"     d'   ,P    d"    ,P
 `Y,   `8,    `Ya         ,8"   ,P'   ,P'    d'
  `Y,   `Ya,    `Ya,,__,,d"'   ,P'   ,P"    ,P
   `Y,    `Ya,     `""""'     ,P'   ,d"    ,P'
    `Yb,    `"Ya,_          ,d"    ,P'    ,P'
      `Yb,      ""YbaaaaaadP"     ,P'    ,P'
        `Yba,                   ,d'    ,dP'
           `"Yba,__       __,adP"     dP"
               `"""""""""""""'
##############################################################
###############Makes spiral array with any size###############
##############################################################
*/
public class Main {

    //Print array with a sort of alignment
    static void printArr(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[a.length/2][a[i].length/2] > 99) {
                    if (a[i][j] < 10)
                        System.out.print("00" + a[i][j] + " ");
                    else if (a[i][j] < 100)
                        System.out.print("0" + a[i][j] + " ");
                    else if (a[i][j] < 1000)
                        System.out.print(a[i][j] + " ");
                    else
                        System.out.print("XXX ");
                }
                else if (a[a.length/2][a[i].length/2] > 9){
                    if (a[i][j] < 10)
                        System.out.print("0" + a[i][j] + " ");
                    else
                        System.out.print(a[i][j] + " ");
                }
                else System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0; //Array size
        String buf; //for rubbish in input



        //Input with protection
        System.out.println("Введите длину и ширину массива:");
        while (a == 0) {
            if(scan.hasNextInt()) a = scan.nextInt();
            else buf = scan.nextLine();
        }
        while (b == 0) {
            if(scan.hasNextInt()) b = scan.nextInt();
            else buf = scan.nextLine();
        }
        System.out.println("Будет создан массив размером " + a + "*" + b);



        //needed values
        int[][] arr = new int[a][b];
        int i = 0, j = a, iv = 0, jv = b;
        int arr_n = 1; //number to paste

        //Main func
        while (i < j && iv < jv){
            for(int f = i; f < j; f++){
                arr[f][iv] = arr_n++;
                //printArr(arr);
            }
            for(int f = iv + 1; f < jv; f++){
                arr[j - 1][f] = arr_n++;
                //printArr(arr);
            }
            if(jv - iv != 1) {
                for (int f = j - 2; f > i; f--) {
                    arr[f][jv - 1] = arr_n++;
                    //printArr(arr);
                }
            }
            if(j - i != 1) {
                for (int f = jv - 1; f > iv; f--) {
                    arr[i][f] = arr_n++;
                    //printArr(arr);
                }
            }
            i++;
            j--;
            iv++;
            jv--;
        }

        //Printing final array
        printArr(arr);





        //From center

    }
}
