package days.day17_arrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
       //elementin array'in icinde olup olmadigini arastiriyoruz
        int[]arr={2,8,4,1,9,3,6};
        System.out.println(Arrays.binarySearch(arr, 2));//-5 dedi sort yapmadigim icin
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 6, 8, 9]
        Arrays.binarySearch(arr,2);//1
        Arrays.binarySearch(arr,9);//5

        //Olmayan bir element aradigimizda ne olur?
        //indexOf'daki -1 gibi mantikli - bir deger yazar
        System.out.println(Arrays.binarySearch(arr, 0));//-1
        System.out.println(Arrays.binarySearch(arr, 5));//-5
        System.out.println(Arrays.binarySearch(arr, 18));//-8

        /*Olmayan bir elementi binarySearch ile aratirirsaniz
        once listede olsaydi,kacinci sirada olacakti sorusunun cevabini bulur
        olmadigini belirtmek icin basina - koyar
         */
    }
}
