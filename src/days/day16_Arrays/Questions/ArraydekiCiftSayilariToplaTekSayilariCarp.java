package days.day16_Arrays.Questions;

import java.util.Arrays;

public class ArraydekiCiftSayilariToplaTekSayilariCarp {
    public static void main(String[] args) {
        int[]arr={3,-3,5,-6,1,-2};
        top_carp(arr);
    }
    public static void top_carp(int[]arr){
        int sum=0;
        int carp=1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] %2==0){
                sum+=arr[i];

            }else{
                carp*=arr[i];
            }

        }
        System.out.println("carp = " + carp);
        System.out.println("sum = " + sum);
    }
}
