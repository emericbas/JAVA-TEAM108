package days.day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class Questions4 {
    public static void main(String[] args) {
      /*  Question 4- Ask the user for positive integers to be added.
       Ask the user to press 0 when he wants to finish.
       When the user wants to finish, print the total number of positive integers entered and their sum.
        Second part: If the user enters negative numbers, print "you cannot use negative numbers". Do not
        add this negative number to the number of numbers and the sum*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive integer to be added");
       int enterNumber=1;
        int sum = 0;
        int counter = 0;
            while (enterNumber != 0) {
               enterNumber = scan.nextInt();
                if(enterNumber>0){
                sum += enterNumber;
                counter++;
                } else if (enterNumber< 0) {
                    System.out.println("you cannot use negative numbers");
                }
                } System.out.println(counter + " sayinin toplami: " + sum);
        }
    }
