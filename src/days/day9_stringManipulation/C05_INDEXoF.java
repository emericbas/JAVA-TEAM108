package days.day9_stringManipulation;

public class C05_INDEXoF {
    public static void main(String[] args) {
        String str="Java ile kodlama cok kolay";

        // str "cok " iceriyor mu?
        System.out.println(str.contains("cok"));//true

        //kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirn
        //
        System.out.println(str.indexOf('a'));//1     char=ilk a yi bulup index ini yzdirir
        System.out.println(str.indexOf("v"));//2
        System.out.println(str.indexOf("cok"));//17  ilk harf c'nin yerinin index sayisi.Saymaya 0'dan baslar

//9.indexten sonraki a' yi bul
        System.out.println(str.indexOf("a",9));//13
//13. index a ise sonraki a'yi bul
        System.out.println(str.indexOf("a", 14));//15
        System.out.println("*************************************");
        //"Java ile kodlama cok kolay";
        //2. o'nun index ini yazdir= once ilk o'nun indexini bulup,sonra o indexten  sonrasinda 2. o'yu buluruz
        System.out.println(str.indexOf("o"));//10
       int ilko=str.indexOf("o");
        System.out.println(str.indexOf("o", ilko+1));
        // +1 yapmazsak ilk o'nun yerini yazar

        //olmayan bir string de ne gonderecek?=Herzzaman -1 dondurur
        System.out.println(str.indexOf("z"));// x olmadigi icin -1 donuyor


    }
}
