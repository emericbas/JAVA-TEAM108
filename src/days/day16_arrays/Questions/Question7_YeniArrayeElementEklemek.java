package days.day16_arrays.Questions;

import java.util.Arrays;

public class Question7_YeniArrayeElementEklemek {
    public static void main(String[] args) {
        // Question 7- Write a method that adds a desired element to a given array
        // and returns it to us,
        // assign the new value to the old array
        int [] arr={1,3,5,8};
       arr= add(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[]add(int[]arr){
        int eklenen=7;
       int []arr1=new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=arr[i];

        }
        arr1[arr1.length-1]=eklenen;
        arr=arr1;
        return arr;
    }
}
