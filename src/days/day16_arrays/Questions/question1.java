package days.day16_arrays.Questions;

import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        // Question 1- Create a method that increments all the elements of a given int array by 2 and
        // returns it to us.
        // Save the old array as it is new.
        int[] arr = {2, 4, 7, 11};
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+2;
         }
        System.out.println(Arrays.toString(arr));//[4, 6, 9, 13]
       arr=elementleriIkiArtir(arr);
        System.out.println(Arrays.toString(arr));//[6, 8, 11, 15]


    }
    public static int[] elementleriIkiArtir(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+2;
        }return arr;
    }
}
