package days.day17_arrays;

import java.util.Arrays;

public class C02_Equals {
    public static void main(String[] args) {
        int[]arr1={3, 8, 0};
        int[]arr2={8, 3, 0};
        System.out.println(Arrays.equals(arr1, arr2));//false

        //equals methodu hem elementleri hem de index'leri kontrol eder ayni indexlerde ayni element varsa true,yoksa false doner

        //Eger siralamadan dolayi false donmesini istemiyorsak once sort yapariz
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));//true
    }
}
