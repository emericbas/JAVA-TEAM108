package days.day8_stringManipulations;

import java.util.Locale;

public class C08_substring {
    public static void main(String[] args) {
        String isim="haSAN";
        //ilk harfi buyuk geriye kalanlari kucuk yazdir
        System.out.println(isim.substring(0,1).toUpperCase(Locale.ROOT)+isim.substring(1).toLowerCase());
        //sadece 3.index'teki harfi yaz
        System.out.println(isim.substring(3,4));//A

    }
}
