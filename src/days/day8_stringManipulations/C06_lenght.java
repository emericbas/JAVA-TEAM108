package days.day8_stringManipulations;

import java.util.Random;

public class C06_lenght {
    public static void main(String[] args) {
        String str="Java her gecen gun daha da guzellesiyor";
        //sondn 3. karAkteri yazdirin

        System.out.println(str.charAt(str.length()-3));// y .Dinamic code denir
        System.out.println(str.length());

        //rastgele bir karakter yazdiralim
        Random rnd=new Random();// rnd degeri icin o ile 1 arasinda rastgele bir deger olusturur
        int index=rnd.nextInt(str.length());//str.lenght()'den kucuk rstgele bir int uretir
        System.out.println(str.charAt(index));
    }
}
