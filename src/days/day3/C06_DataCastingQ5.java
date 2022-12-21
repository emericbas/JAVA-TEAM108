package days.day3;

import java.util.Scanner;

public class C06_DataCastingQ5 {
    public static void main(String[] args) {
        /* QUES 5) KULLANICIDAN BIR DOUBLE ,BIR TAMSAYI ALIN
        DOUBLE I IKINCI SAYIYA BOLUN
        VE BOLUM ISLEMININ SONUCUNU TAM SAYI KISMINI YAZDIRIN
         */
         Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a decimal num");
        double numdbl=scan.nextDouble();
        System.out.println("Please enter an integer num");
        int num= scan.nextInt();
        System.out.println((int)(numdbl / num));

    }
}
