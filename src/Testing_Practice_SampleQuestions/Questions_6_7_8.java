package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class Questions_6_7_8 {
    public static void main(String[] args) {
       /* Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayınç
        Ipuclari:
·        Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin*/
Scanner scan=new Scanner(System.in);
        System.out.println("Ne kadar cay iciyorsunuz?");
        System.out.println("Ne kadar seker kullaniyorsunuz?");
double  cay= scan.nextDouble();
double seker= scan.nextDouble();

 double kullanilanSeker=cay*365* seker*1.5/1000;
        System.out.println(kullanilanSeker);
        System.out.println("**************************************");
 /*Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim. (edited)
*/
        System.out.println("Please enter double a number");
        double number=scan.nextDouble();
        int intNumber=(int) number;
        System.out.println(intNumber);
        System.out.println("********************************************");
      /*  Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin rakamlari toplamini ekranda yazdirin.
        */

        System.out.println("Please enter a number with three digits");
        int threeDigit=scan.nextInt();
        int sumOfNumber=0;
        for (int i = 3; i >=1; i--) {
        sumOfNumber  +=  threeDigit%10;
         threeDigit=threeDigit/10;

        }
        System.out.println(sumOfNumber);


    }
}
