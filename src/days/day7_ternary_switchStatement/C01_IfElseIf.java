package days.day7_ternary_switchStatement;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        /* kullanicidan bir tamsayi alin
        sayi rakam ise "girilen sayi rakam"
        sayi 2 basamakli ise "girilen sayi iki basamakli"
        sayi 2 basamaktan buyukse buuk sayi yaxzdir
        */
         Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int girilenSayi= scan.nextInt();
         if(0<=girilenSayi&&girilenSayi<=9) System.out.println("girilen sayi rakam");
         else if(10<=girilenSayi && girilenSayi<=99) System.out.println("girilen sayi iki basamakli");
         else if(girilenSayi>=100) System.out.println("Buyuk sayi");
         // !!!!!!!!!      ELSE ile bitse geriye kalan butun degerleri kapsar
        // !!!!!!          ELSE IF ile bitse sadece o durumlari kapsar,
        //                 sartlarin tamamini dikkatli yazmak gerekirdi
        //                 burada negatifleri kapsamadi
    }
}
