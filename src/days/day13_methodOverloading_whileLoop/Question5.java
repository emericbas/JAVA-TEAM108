package days.day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
       /* Question 5- Ask the user for a number and the power he wants to calculate. Create a method that
        calculates and prints the desired power of the given number using the while loop*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number and power");
        int number=scan.nextInt();
        int power=scan.nextInt();
        power(number,power);
    }public static void power(int alt,int ust){
        int toplam=1;
        while (ust>0) {
            toplam*= alt;
            ust--;
        }
        System.out.println(alt);

    }}
