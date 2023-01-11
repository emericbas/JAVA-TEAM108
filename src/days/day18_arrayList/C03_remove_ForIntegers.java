package days.day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_remove_ForIntegers {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);//[10, 5, 7, 9]
        System.out.println(sayilar.contains(9));//true
        System.out.println(sayilar.contains("9"));//false

        //  sayilar.remove(5); 5'i obje olarak goruyor
        /*
        Eger listemiz integer'lardan olusuyorsa
        parametre olarak yzdigimiz sayinin index mi yoksa silmek istedigimiz obje mi oldugu beleirsiz olmasin diye
         Java otomatik olarak girilen sayiyi index olarak kabul eder

         Eger Integer'lardan olusan bir listede obje olark bir elementi silmek istersek
          once onu tanimlamaliyiz
         */

        Integer silinecekElement=5;
        System.out.println(sayilar.remove(silinecekElement)); // true
       System.out.println(sayilar); // [10, 7, 9]

    }
}
