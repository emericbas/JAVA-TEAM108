package GenelTekrar;

import java.util.Scanner;

public class ifLeNotOrtalamasi {
    public static void main(String[] args) {
        //kullanicidan vize ve final notlarini aliniz.
        // Kullanicinin istedigi oranlarda vize ve final yuzdeleri not ile not ortalamasini hesaplayip,
        // not ortalamasini yazdirip
        // 50 ve buyukse " Tebrikler dersi basari ile gectuiniz .."
        // kucuk ise "Malesef dersten kaldiniz.." yazdiriniz
        Scanner scan= new Scanner(System.in);
        System.out.println("vize ve final notunu giriniz");
        double vize=scan.nextDouble();
        double finalNot=scan.nextDouble();
        System.out.println("vize ve finalin yuzde oranini belirleyiniz");
        double vizeOran=scan.nextDouble();
        double finalOran=scan.nextDouble();
        double ortalama=vize*vizeOran+finalNot*finalOran;
        if (ortalama>=50){
            System.out.println(" Tebrikler dersi basari ile gectuiniz .." );
        }else System.out.println("Malesef dersten kaldiniz..");
    }
}
