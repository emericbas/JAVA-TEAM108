package days.day28_exeptions;

import java.util.Scanner;

public class C02_TrayCatch {
    public static void main(String[] args) {
        /*
        try-catch bloklarinin amaci
        riski  0 yapmak degil
        kodu iyi analiz yapip
        java'nin cozemeyegi durumlarda ne yapmasini istedigimizi kendisine soylemektedir

          Java try blogunda basedemeyecegi bir sorunla karsilasirsa
            siz o sorunu deklare edinceye kadar
            yani catch() satirina kadar
            calismayi durdurur.
            Bu durumda sorun olan satir ile catch satiri arasindaki kodlar CALISMAZ
         */
      //kullanicidan iki tamasayi alip
        // sayilarini birbirine bolup sonucu yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("2 tamsayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();


        try {
            System.out.println("Iki sayinin bolumu : "+sayi1/sayi2);
            System.out.println("kontrl1");
            System.out.println("kontrl2");
            System.out.println("kontrl3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayi 0 olamaz");
            e.printStackTrace();
        }

    }
}
