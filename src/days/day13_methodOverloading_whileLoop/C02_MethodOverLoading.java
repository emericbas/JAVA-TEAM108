package days.day13_methodOverloading_whileLoop;

public class C02_MethodOverLoading {
    public static void main(String[] args) {
        String str="Java cok guzel";
        //eger sectigimiz isimde birden fazla method varsa buna OVERLOADING denir ve
        // ayni isimdeki methodlardan hangisinin calisacagina
        // argument/parametre uyumu karar verir
        toplama(5,6);//11
        toplama(7,8,3);
        toplama(4.5,3.6);
        toplama(3.5,3);
        toplama(5,5.0);
        /*
        Java ayni class icerisinde,ayni isim ve
        data turunden parametre sayisi ile 2 method olusturmamiza izin vermez
        1- Ismini degistirebiliriz.Ancak bu durumda overloading olmaz
        overloading ayni isimde farkli islevde method olusturmak demek
        2-Parametre sayisini degistirebiliriz
         */

    }
    public static void toplama(int sayi1,int sayi2){
        System.out.println("2 tam sayinin toplami : "+ (sayi1+sayi2));
    }
    public static void toplama(int sayi1,int sayi2,int sayi3) {
        System.out.println("3 tam sayinin toplami : "+ (sayi1+sayi2+sayi3)); }
    public static void toplama(double sayi1, int sayi2){
        System.out.println("double ve int  toplami : "+ (sayi1+sayi2));
    }public static void toplama(int sayi2,double sayi1){
        System.out.println("int ve double toplami : "+ (sayi1+sayi2));
    }public static void toplama(double sayi1,double sayi2){
        System.out.println("2 double  toplami : "+ (sayi1+sayi2));
    }
}
