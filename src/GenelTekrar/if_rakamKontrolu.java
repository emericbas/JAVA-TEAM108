package GenelTekrar;

import java.util.Scanner;

public class if_rakamKontrolu {
    public static void main(String[] args) {
        //kullanicidan bir sayi aliniz.
        // sAYI 0'DAN BUYUK Esitse 10'dan kucuk olup olmadigin kontrol ediniz.
        // 10'dan kucuk ise ekrana "Rakam" yazdirip degilse "Poztif sayi " yazdiriniz.
        // sayi 0'dan kucuk ise ekrana "Negatif sayi" yazdiriniz"
        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();
        if(sayi>=0){
            if(sayi>=10){
                System.out.println("Poztif sayi ");
            }else System.out.println("rakam");
        }else System.out.println("Negatif sayi");

        System.out.println("=====TERNARY=======");
        String sonuc=(sayi>=0)? ((sayi<10)?"rakam":"pozitif sayi")  :("negatif sayi");
        System.out.println(sonuc);
    }
}
