package GenelTekrar;

import java.util.Scanner;

public class sporSalonu {
    public static void main(String[] args) {
        //spor salonu icin kullanicidan isim,soyisim,yas,kilo,boy,salona devam edcegi ay suresi
        // bilgilerini alip
        // aylik $20 olarak toplam ucretini yazdiriniz
        Scanner scan =new Scanner(System.in);
        System.out.println("isim,soyisim,yas,kilo, boy,sure giriniz");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();
        int kilo=scan.nextInt();
        int boy=scan.nextInt();
        int sure=scan.nextInt();
        int ucret=sure*20;
        System.out.println(ucret);
    }
}
