package days.day17_arrays;

import java.util.Arrays;

public class Soru3ToplamaAtama {
    public static void main(String[] args) {
      //  Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
        //  yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
       // input :  int[][] arr = {{-2},{1,5,6},{-8,7},{0,8,6,3,-2}};
      //  output: [-2, 12, -1, 15]
        int[][]arr={{-2},{1,5,6},{-8,7},{0,8,6,3,-2}};
        int  arr1[]=new int [arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                arr1[i]+=arr[i][j];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
