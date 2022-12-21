package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class Question1_2_3_4_5 {
    public static void main(String[] args) {
       /* SORU 1
        Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        Ipuclari:
* r=7;
* Pi=3.14
                * Dairenin Cevresi : 2*Pi*r
                * Dairenin Alani : Pi*r*r  (edited)
        */
        int radius=7;
        double pi=3.14;
        System.out.println("Dairenin cevresi = " +(2*pi*radius) );
        System.out.println("Dairenin alani  = " +(radius*pi*radius) );
        System.out.println("---------------------------------------------------");
      /*  Soru-2)
        Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
                Ipuclari:
* Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
* Dikdortgenin Alani : uzun kenar * kisa kenar (edited)
        */
        double kisaKenar=12.5;
        double uzunKenar=10.5;
        System.out.println( "Dikdortgenin Cevresi:" +2 * (uzunKenar + kisaKenar));
        System.out.println( "Dikdortgenin Alani:" +  (uzunKenar * kisaKenar));



System.out.println("---------------------------------------------------");
       /* Soru 3-)   SCANNER
        Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
                Ipuclari:
* Sayilarin ortalamasi: toplam/5
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        double number1= scan.nextDouble();
        double number2= scan.nextDouble();
        double number3= scan.nextDouble();
        double number4= scan.nextDouble();
        double number5= scan.nextDouble();
        System.out.println("Aritmetik ortalama= "+(number1+number2+number3+number4+number5)/5);
        System.out.println("---------------------------------------------------");
        /* Soru 4-)   SCANNER
        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
        Ipuclari:
* Sayinin küpü: sayi*sayi*sayi
 */
        System.out.println("---------------------------------------------------");
        System.out.println("Please enter a number");
     int sayi=scan.nextInt();
        System.out.println("Sayinin kupunun yarisi= "+ (sayi*sayi*sayi/2));
     /*  Soru 5-)   SCANNER
        Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
*/
        System.out.println("---------------------------------------------------");
    }
}
