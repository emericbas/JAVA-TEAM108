package days.day8_stringManipulations;

public class C07_substring {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";
        System.out.println(str.length());// karakter sayisi:19
        System.out.println(str.charAt(str.length()/2));//metnin tam ortasindaki karakter: n
        System.out.println(str.charAt(str.length()-1));//son karakter;p

        // bir karakteri degilde verilen stringin metin parcasini elde etmek istersek
        //ornegin "ogren" kelimesini yazdiralim
        System.out.println(str.substring(5, 9));// ogre
        //substring(bas,bitis) metodun'da
        //baslangic olarak yazilan index(inclusive0
        //bitis olarak yazilan index(exclusive)'dir
        System.out.println(str.substring(5,10));//ogren
        System.out.println(str.substring(0,4));//Java
        System.out.println(str.substring(16,19));//kap
        System.out.println(str.substring(16));//sonuna kadar oldugu icin sadece substring()kullandim
        System.out.println(str.substring(str.length()-3));//kap

        // substring kullanarak sadece J harfini yadzirin
        System.out.println(str.substring(0,1));//J

        //9.index teki harfi buyuk olarak yazdirin
        System.out.println(str.substring(9,10).toUpperCase());
        System.out.println(str.charAt(9));// n olur
        // charAt yerine substring kullanmak daha avantajlidir.
        // C unku substring kullaninca ifade hala string oldugu icin
        // farkli methodlar ullanabiliriz

        System.out.println(str.substring(5,5));//hic bir sey yazdirmaz.Bos satir olusur
        System.out.println("**************");

       // System.out.println(str.substring(4,3));//error verir.Geri vites yok.StringIndexOutOFeXCEPTION
      //  System.out.println(str.substring(25,28));//error verir.StringIndexOutOFeXCEPTION
        System.out.println(str.substring((str.length()-1)));//p
        System.out.println(str.substring(str.length()));// bos satir

    }
}
