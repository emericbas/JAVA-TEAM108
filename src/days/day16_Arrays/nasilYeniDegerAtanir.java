package days.day16_Arrays;

import java.util.Arrays;

public class nasilYeniDegerAtanir {
    public static void main(String[] args) {
        //1-  Var olan bir array'i yeni deger olarak atayabiliriz.
        String []arr1={"Ali","veli"};
        String[]arr2={"a","b","c"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));//[a, b, c]

        //2- istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz
        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));//[null, null, null, null, null, null]

       // 3- yeni olusturulan bir array'e { } icinde deger yazarak atama yapabiliriz.
        // Ancak var olan bir array'e yeni deger atamasi icin  { } KULLANILMAZ
      //  arr1={"g","h"};//OLMAZ
        System.out.println("-----------------------------------");

        int[]arr={2,4,6};
        //bu arraye 4. element olarak 8 ekleyelim

        /*Var olan array'e yeni eleman eklenemez ama yeni deger atanabilir
         once int[] arr3=[2,4,6,8] seklinde yeni bir array olusturup
         sonra arr2 degerini arr'ye atayabilirim'
         */
      int[] arr3={2,4,6,8};
      arr=arr3;
        System.out.println(Arrays.toString(arr));//[2, 4, 6, 8]

}
}