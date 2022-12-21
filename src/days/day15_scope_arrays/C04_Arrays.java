package days.day15_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {




        System.out.println("---------------------------");
        int [] arr={1,2,3};//bu sekilde yazildiginda kac element yazildi ise onu lenght olarak kabul eder
        int arr2[]={4,5,6,7,8};
        String [] harfler=new String[4];//deger   yazmadigimiz icin [0,0,0,0]
        System.out.println(arr.length);//3
        System.out.println(harfler.length);//4
        System.out.println(arr[0]);//1 ====> 0.index'teki element
        System.out.println(arr2[4]);//8====>4.indexteki
        //String'de kullandigimiz harfler.length() bir method iken
        //  array'deki length method degil variable'dir  arr.length

        arr[2]=-78;
        System.out.println(arr[2]);//-78   DEGISTIRME yapar
        System.out.println(arr2[arr2.length - 1]);//8======>SOn SAYI
        //arr2'nin Tum elementleri yazdirin
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i]+" ");//4 5 6 7 8
        }
        System.out.println();
//arr'nin elemanlarini yazdir
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");//1 2 -78 degismis halini yazdirdi

        }
    }
}
