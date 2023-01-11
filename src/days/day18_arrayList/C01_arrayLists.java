package days.day18_arrayList;

import days.day16_arrays.C10_ArrayeBirElementEklemeSoru7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arrayLists {
    public static void main(String[] args) {
        String [] arr={"A","B","T"};
        //Bu array'e element olarak  C eklemek istersek
       arr= C10_ArrayeBirElementEklemeSoru7.arrayeElementEkleme(arr,"C");
        System.out.println(Arrays.toString(arr));

        //ArrayList esnek uzunluktaki bir array'dir.
        // Ancak ArrayList,  array  alt yapisini kullandigindan
        // elementleri sadece tek tek ekleyebiliriz
        List<String > harfler=new ArrayList<>();
        System.out.println(harfler);//[]
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);//[A, B, K]
        //A ile B arasina C yazdir
        harfler.add(1,"C");
        System.out.println(harfler);//[A, C, B, K]

        //D'yi B ile K arasina ekle
        harfler.add(3,"D");
        System.out.println(harfler);//[A, C, B, D, K]
//
        List<String>karakterler=new ArrayList<>();
        karakterler.add("*");
        karakterler.add("@");
  //add collection kullanarak
        harfler.addAll(karakterler);
        System.out.println(harfler); // [A, C, B, D, K, *, @]
        harfler.addAll(2,karakterler);
        System.out.println(harfler); // [A, C, *,@ , B, D, K, *, @]

    }

}
