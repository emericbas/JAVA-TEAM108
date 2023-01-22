package GenelTekrar;

import java.util.Scanner;

public class buyukKucukHataliHarf {
    public static void main(String[] args) {
        //kullanicidan 1 harf (karakter) aliniz .
        // Bunun buyuk harf,kucuk harf ya da hatali giris seklinde
        // code create ediniz
        Scanner scan= new Scanner( System.in);
        System.out.println("bir karakter giriniz");
        char karakter= scan.next().charAt(0);
        if(karakter>='A' && karakter<='Z'){
            System.out.println("Karakter buyuk harf");
        }else if (karakter>='a' && karakter<='z'){
            System.out.println("Karakter kucuk harf");
        }else System.out.println("Hatali giris yaptiniz");
    }
}
