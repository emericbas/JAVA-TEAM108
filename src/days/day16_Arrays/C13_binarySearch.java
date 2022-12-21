package days.day16_Arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {
        //once sort yapip sonra aratmazsak yanlis olabilir.Ortadan once ve sonrasi ile karsilastiriyor
        //Array'de istenen elemanin varligini kontrol eder. Ortadan baslayarak yapar
        int[]arr={1,8,3,7,2,5,8,1};
        System.out.println(Arrays.binarySearch(arr,8));//6----->sort yapmazsan once yanlis yapar
        System.out.println(Arrays.binarySearch(arr,2));//-2---->sort yapmazsan once yanlis yapar
Arrays.sort(arr);//sort yaptik
        System.out.println(Arrays.toString(arr));//[1, 1, 2, 3, 5, 7, 8, 8]
        System.out.println(Arrays.binarySearch(arr, 8));//6
        System.out.println(Arrays.binarySearch(arr, 2));//2
    }
}
