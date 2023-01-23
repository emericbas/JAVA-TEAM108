package GenelTekrar;

import java.util.Scanner;

public class ATMapplication {
    public static void main(String[] args) {
        //Bakiye(baslangic bakiyesi 1000 tl)ogrenme,
        // para yatirma ve cekme ,
        // cikis
        // islemlerinin yapildigi bir ATM application code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("yapmak istediginiz isleme gore bir rakam giriniz:\n 1)Bakiye ogrenme\n 2)Para yatirma \n 3)Para cekme\n 4)cikis\n SECIMINIZ:");
        int secim=scan.nextInt();
        int bakiye=1000;
       switch (secim) {
           case 1: {
               System.out.println("Bakiyeniz :" + bakiye);
               break;
           }
           case 2: {
               System.out.println("yatirmak istediginiz miktari giriniz");
               int miktar = scan.nextInt();
               bakiye += miktar;
               System.out.println("Bakiyeniz :" + bakiye);
               break;
           }
           case 3: {
               System.out.println("cekeceginiz miktari giriniz");
               int cekMiktar = scan.nextInt();
               if(cekMiktar>0){
               if(cekMiktar<=bakiye){
               bakiye -= cekMiktar;
               System.out.println("Bakiyeniz :" + bakiye);}
               else System.out.println("paraniz yeterli degil");
              System.exit(0);
           }}
           case 4: {
               System.out.println("sistemden ciktiniz");
              // break;
               System.exit(0);
           }
           default:
               System.out.println("gecerli bir sayi giriniz");
       }

    }
}
