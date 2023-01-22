package GenelTekrar;

import java.util.Scanner;

public class kanBagisi {
    public static void main(String[] args) {
        //kullanicidan yasini ve kilosunu aliniz.
        // 18 yasindan kucuk ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kg'dan hafifse kan bagisi yapamaz.
        // 18 yasindan buyuk ve  50 kilodan agirsa kan bagisi yapabilir
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi  ve kilonuzu giriniz");
        int yas=scan.nextInt();
        int kilo=scan.nextInt();
        if(yas<18){
            System.out.println("kan bagisi yapamaz.");
        }else if (yas>=18 && kilo<50){
            System.out.println("kan bagisi yapamaz.");
        }else if(yas>=18 && kilo>=50) System.out.println("kan bagisi yapabilir");


    }
}
