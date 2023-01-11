package days.day11_forLoop;

import java.util.Scanner;

public class C05_ForLoopAllQues3 {
    public static void main(String[] args) {
       /*
        Question 1- Print the numbers 1 to 100 on the same line with a space between them.
        Question 2- Take a positive integer from the user, print numbers divisible by 7 from 1 to the entered
                   number (including the entered number).*/
       // Question 3- Take positive numbers as starting and ending values from the user, print the sum of all
      //  numbers between them, including the borders. If the end value is less than the start value,
      //  print a warning and end the process
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter baslangic ve bitis degerleri icin pozitif iki tamsayi giriniz");
        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();
         if(bitis<baslangic){
             System.out.println("baslangic bitis degerinden kucuk olmali");
         }else{
             int toplam=0;
             for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;//tum sayilari sirasi ile toplam'a ekledik
             }
             System.out.println(baslangic+ " ile "+ bitis+" arasindaki sayilarin toplami: "+ toplam);
         }

      /*
       Question 4- Get positive numbers as starting and ending values from the user, print the sum of all
        numbers between them, including the borders. Let the program run even if the end value is
        smaller than the start value
        Question 5- Take a number less than 20 from the user and calculate the factorial value of this
        number.
         Question 6- Get a number less than 20 from the user and calculate the factorial value of this
        number. Also print the configuration of the factorial account in the console.
                exp: 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        For Loops
        Question 7- Get a positive integer from the user and print the sum of the digits.*/

       /* Question 10 (interview) - Ask the user for a String and reverse the String and save it.
          Question 11- Ask the user for a positive integer, check if the number is prime and print the result.

  */  }
}
