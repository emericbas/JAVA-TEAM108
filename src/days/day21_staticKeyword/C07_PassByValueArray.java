package days.day21_staticKeyword;

import java.util.Arrays;

public class C07_PassByValueArray {
    public static void main(String[] args) {
        //create a method that takes an array and
        // increases its values by 5 then returns that array
        int []arr={2,3,3,4,5,-8};
        System.out.println(Arrays.toString(increase(arr)));//[7, 8, 8, 9, 10, -3] Array'in ici degisse de ARRAY degismiyor.
        // araba ayni,yolcular degisti
    }
    public static int[] increase(int[]arr){

        for (int i = 0; i <arr.length ; i++) {
           arr[i]+=5;
        }return arr;
    }
}
