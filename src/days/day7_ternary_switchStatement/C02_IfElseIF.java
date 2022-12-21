package days.day7_ternary_switchStatement;

import java.util.Scanner;

public class C02_IfElseIF {
    public static void main(String[] args) {
         /* kullanicidan bir tamsayi alin
        sayi rakam ise "girilen sayi rakam"
        sayi 2 basamakli ise "girilen sayi iki basamakli"
        sayi 2 basamaktan buyukse buuk sayi yaxzdir
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int girilenSayi= scan.nextInt();
if(girilenSayi<0) System.out.println("Negatif sayi");
else if(girilenSayi<=9) System.out.println("Girilen sayi rajkam");
else if(girilenSayi<=99) System.out.println("Girilen sayi 2 basamakli");
else System.out.println("Buyuk sayi");
// ELSE ile bitince baska hicbir ihtimal kalmaz
    }
}
