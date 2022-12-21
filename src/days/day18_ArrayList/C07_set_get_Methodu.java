package days.day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set_get_Methodu  {
    public static void main(String[] args) {
        //java'da bir cok yapida get ve set methodlari bulunur.
        // get methodu bilgiyi bize getirirken
        // set methodu bilgiyi update  guncelleme yapar

        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler); // [A, Z, T]
        // 2.index'e F elemanini ekleyin
        // add method'u var olan listeden herhangi bir elementi degistirmeden
        // istedigimiz elementi ekler, kalanlari kaydirir
        harfler.add(2,"F");
        System.out.println(harfler); // [A, Z, F, T]
        harfler.set(2,"M");
        System.out.println(harfler); // [A, Z, M, T]
        // set method'u var olan elemntin degerini gunceller
        // eleman sayisini artirmaz


    }
}
