package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class TopZiplama {
    public static void main(String[] args) {
        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan
        //do while code blogu create ediniz.

Scanner scan =new Scanner(System.in);
        System.out.println("yukseklk giriniz");
        double yukseklik=scan .nextDouble();
        //islem en az 1 kez calisacagi icin do while olmali
        double topunToplamYolu=0;
        int yereVurmaSayisi=0;

        do{
            topunToplamYolu+=yukseklik;
            yereVurmaSayisi++;
            yukseklik*=0.75;topunToplamYolu+=yukseklik;
        }

    while(yukseklik>=1);
        System.out.println("Topun aldigi yol : "+topunToplamYolu+"\n topun yere vurma sayisi :"+yereVurmaSayisi);
        }
}
