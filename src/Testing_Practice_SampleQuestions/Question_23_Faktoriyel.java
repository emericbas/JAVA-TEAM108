package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class Question_23_Faktoriyel {
    public static void main(String[] args) {
     /*  Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=6*5*4*3*2*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.*/
        int sayi=6;
        faktoriyel(sayi);
    }

    private static void faktoriyel(int sayi) {
        int fact=1;
        String sekil="";
        for (int i = sayi; i >=1 ; i--) {
            fact*=i;
        }
        for (int i = sayi; i >1; i--) {
            sekil+=i+"*";
        }
        System.out.println(sayi +"! = "+sekil+"1 = "+fact);
   }
}