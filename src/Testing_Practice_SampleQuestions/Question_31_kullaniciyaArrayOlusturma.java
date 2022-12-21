package Testing_Practice_SampleQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Question_31_kullaniciyaArrayOlusturma {
    public static void main(String[] args) {
       /* Soru 31-)
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen liste uzunlugunu giriniz");
        int arrayUzunlugu=scan.nextInt();
        int[]kullaniciArrayi=new int [arrayUzunlugu];
        for (int i = 0; i < arrayUzunlugu; i++) {
            System.out.println("Listenin "+ i+". index 'ini giriniz");
            int elementler= scan.nextInt();
            kullaniciArrayi[i]=elementler;
        }
        System.out.println("Listenin son hali = "+Arrays.toString(kullaniciArrayi));

    }
}
