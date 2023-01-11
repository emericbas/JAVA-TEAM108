package days.day14_doWhileLoop_scope;

public class C05_Scope {
    int sayi=10;
    static int number;
    public static void main(String[] args) {
       String mainStr="Java";
       number=10;
       //sayi=20;
        for (int i = 0; i <10 ; i++) {
            int toplam=i;

        }
      //  System.out.println(toplam);for loop 'un icinde tanimlandigi ya da olusturuldugu icin kivircigin disinda kullanilmaz
      //  System.out.println(i);
    }
    public static void method1(){
        String mathod1Str="guzel";
        number=20;
        //sayi=14;
      //  System.out.println(mainStr);
      //  System.out.println(method2Str);
    }
    public static void method2(){
        String method2Str="candir";
        number=30;
        //  System.out.println(mainStr);
    }
}
