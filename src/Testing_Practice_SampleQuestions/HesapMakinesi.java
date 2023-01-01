package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
       /* Problem Tanımı :
        Basit 4 işlem yapan bir hesap makinesi kodlayınız.

        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
        Kullanicidan iki sayi girmesini isteyiniz.
                Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("bolme islemi icin="+'/'+"\ncarpma islemi icin= "+'*'+"\ntoplama islemi icin= "+'+'+"\ncikarma islemi icin= "+'-'+"\n birini giriniz");
        char islem=scan.next().charAt(0);
        System.out.println("iki sayi giriniz");
        double sayi1=scan .nextDouble();
        double sayi2=scan .nextDouble();

       switch (islem){
           case '/':
               System.out.println("sayi1 ve sayi 2nin bolme islemi="+sayi1/sayi2);
               break;
           case '*':
               System.out.println("sayi1 ve sayi 2nin carpim islemi="+sayi1*sayi2);
               break;
           case '+':
               System.out.println("sayi1 ve sayi 2nin toplam  islemi="+sayi1+sayi2);
               break;
           case '-':
               System.out.println("sayi1 ve sayi 2nin cikarma islemi="+(sayi1-sayi2));
               break;
           default:
               System.out.println("Gecerli islem giriniz");
        }
    }
}
