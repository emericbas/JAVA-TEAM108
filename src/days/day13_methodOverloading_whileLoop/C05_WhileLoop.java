package days.day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
       // Kullanicidan toplamak uzere sayi alin
        // girilen sayilarin toplami 500 olur veya gecerse
        // "bu kadar sayi yeterli" deyip
        // toplami  ve kac sayi girildigini yazdirin


        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        for (int i = 1; i < 10000; i++) {
            System.out.println("toplamak icin tamsayi girin");
            sayi= scan.nextInt();
            toplam+=sayi;

            if(toplam>=500){
                System.out.println("bu kadar sayi yeterli");
                break;
            }
        }
        System.out.println("-------while loop ile-------------------");

        //adim sayisi belli degilse while loop
        toplam=0;
        sayi=0;
        while(toplam<500){
            System.out.println("toplamak uzere tamsayi gir");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("bu kadar sayi yeterli");
    }
}
