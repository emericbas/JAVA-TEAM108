package days.day16_Arrays.Questions;

import java.util.Arrays;

public class questions3_interwiew_sagaKaydirma {
    public static void main(String[] args) {
       /* Question 3- (Interview) Create a method that will shift all the elements in a given array to the right and
        move the last element to the beginning, save the array as new.
                Orn : input : [4,5,6,7] is the final state of the array. : [7,4,5,6]*/
       int []arr = {4,5,6,7};
      arr=sagaKaydir(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sagaKaydir(int []arr){
        int temp=arr[arr.length-1];
        for (int i =arr.length-2 ; i >= 0; i--) {
            arr[i+1]=arr[i];


        }arr[0]=temp;
        return arr;

    }
}
