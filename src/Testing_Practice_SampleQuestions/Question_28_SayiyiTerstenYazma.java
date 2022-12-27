package Testing_Practice_SampleQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_28_SayiyiTerstenYazma {
    public static void main(String[] args) {
      /*
       Soru-28)

        Kullanıcının girdiği sayıyı tersine çeviren bir program yazın.
        Örnek:
        Sayı: 1238
        Sayının Tersi: 8321
        İpucu:  Loop kullanabilirsiniz.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        String number=""+sayi;
        String reverse="";
        for (int i = number.length()-1; i >=0; i--) {
            reverse+=number.charAt(i);
        }
        System.out.println(sayi+" nin tersi : "+reverse+" sayisidir");

        }
    }

