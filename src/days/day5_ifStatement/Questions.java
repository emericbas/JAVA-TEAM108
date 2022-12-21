package days.day5_ifStatement;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        /* if cumlelerinde sart parantezinden sonra body kullanmazsak ilk ;'e kadar olan kismi body olarak kabul eder.
        Eger if body si icin yazilacakkod bir satirdan fazla ise {} kullanilmalidir
         */
        /* Question3) take a number 3 ile bolunuyorsa 3
        5 ile bol 5 ile bolunen  sayi yazdir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int num= scan.nextInt();
        if(num%3==0){
            System.out.println("This number is divided by 3");}
        if(num%5==0){
            System.out.println("This number is divided by 5");}

    }
}
