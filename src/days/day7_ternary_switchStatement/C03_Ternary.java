package days.day7_ternary_switchStatement;

public class C03_Ternary {
    public static void main(String[] args) {
        // input olarak verilen sayiyi kontrol edip
        //sayi cift ise "cift sayi"
        //degilse "tek sayi" yazdirin

        int input=-90;
        // if else if ile yapalim
        if(input%2==0) System.out.println("cift sayi");
        else System.out.println(" tek sayi");

        //ternary ile yapalim. Basit if else 'lerde ise yarar
        System.out.println(input%2==0 ?"Cift  sayi"  :  " Tek sayi");
    }
}
