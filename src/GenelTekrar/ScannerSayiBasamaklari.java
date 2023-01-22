package GenelTekrar;

import java.util.Scanner;

public class ScannerSayiBasamaklari {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        // input=853
        //output= birlerbas=3,onlarb =5, yuzlerb=8
        int sayi=scan.nextInt();
        int birlerBasamagi=sayi%10;
        sayi=sayi/10;
        int onlarBasamagi=sayi%10;
        sayi=sayi/10;
        int yuzlerBasamagi=sayi%10;
        sayi=sayi/10;
        System.out.println(birlerBasamagi+"\n"+onlarBasamagi+"\n"+yuzlerBasamagi);
    }
}
