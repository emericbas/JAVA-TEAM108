package days.day17_arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {
        String str= "Java her gecen gun guzellesiyor";
        //str'da kac kelime var?
        //split methodu  istedigimiz string'i ,
        // istedigimiz ayrac kullanarak parcalara ayirmamiza imkan verir
      String[] spaceSplit=  str.split(" ");
        System.out.println(Arrays.toString(spaceSplit));//[Java, her, gecen, gun, guzellesiyor]
        // Buradaki ; virgul ve bosluklar array den geliyor bizim spaceler degil
        System.out.println("Verilen cumledeki kelime sayisi : "+spaceSplit.length);
        System.out.println(Arrays.toString(str.split("e")));//[Java h, r g, c, n gun guz, ll, siyor]
        System.out.println(Arrays.toString(str.split("gun")));//[Java her gecen ,  guzellesiyor]

        //karakter sayisini bulmak icin hic'likle ("") split yapip sonra length alinir
        System.out.println(Arrays.toString(str.split("")));//[J, a, v, a,  , h, e, r,  , g, e, c, e, n,  , g, u, n,  , g, u, z, e, l, l, e, s, i, y, o, r]
        System.out.println(str.split("").length);//31
    }
}
