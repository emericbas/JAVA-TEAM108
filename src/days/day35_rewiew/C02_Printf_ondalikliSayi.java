package days.day35_rewiew;

import java.util.Scanner;

public class C02_Printf_ondalikliSayi {
    public static void main(String[] args) {
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30 veya daha buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Lutfen cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();
        double vke= kilo*10000/(boy * boy);

        System.out.println("Vucut kitle endeksiniz : " + vke);
        System.out.println("===================================");
        System.out.printf("Vucut kitle indeksiniz  : %.2f  %n",vke);// 2 digit virgulun sonuna kadar aldi.f ile yaptik
        System.out.printf("Vucut kitle indeksiniz  : %-5.2f  %n",vke);//- sola dayali yazdi



        if (vke>=30) System.out.println("Obezsiniz, gec kalmadan kendine ceki duzen vermelisin");
        else if (vke>=25) System.out.println("Kilolusunuz, rejime baslamalisiniz");
        else if (vke>=20) System.out.println("Kilonuz normal, boyle devam edin");
        else System.out.println("zayifsiniz, kilo almalisiniz");
    }
}
