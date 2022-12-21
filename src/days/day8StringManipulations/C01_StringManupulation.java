package days.day8StringManipulations;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class C01_StringManupulation {
    public static void main(String[] args) {
        //Question 4- Ask the user to enter the name of the day,
        // if the entered day is a weekday,
        // print the number of days left for the weekend break as "Now it is working time, vacation in ..days",
        // if the entered day is the weekend, print "Time to rest now"
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of day");

        String girilenGun=scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();// lower secersen asagiya lower yaz.upper yazarsan upper yaz gun isimlerini

        /*string ifadeler case sensitive'dir
        kullanicidan Pazar,pazAr,PAZAR.....gibi 32 farkli sekilde yazma ihtimali var
        Kullanicinin girdigi degeri direk kalici olarak degistirmek cok tercih edilmez.
        bunun yerine kullanicinin girdigi degeri degistirip yeni bir variable'a atama yapar ve
        kodlarimizda yeni variable'i kullaniriz
         */

        switch(kullanilacakGun){
            case "pazartesi":
                System.out.println(girilenGun  + " calisma zamani, tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girilenGun  + " calisma zamani, tatile 4 gun var");
                break;
                case "carsamba":
                System.out.println(girilenGun  + " calisma zamani, tatile 3 gun var");
                break;
                case "persembe":
                System.out.println(girilenGun  + " calisma zamani, tatile 2 gun var");
                break;
                case "cuma":
                System.out.println(girilenGun  + " calisma zamani, tatile 1 gun var");
                break;
                case "cumartesi":
                case "pazar":
                System.out.println(girilenGun  + " tatil zamani,dinlen ");
                break;
            default :
                System.out.println(" dogru gun giriniz");
        }
    }
}
