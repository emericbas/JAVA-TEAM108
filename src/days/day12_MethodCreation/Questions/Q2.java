package days.day12_MethodCreation.Questions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
       // Question 2- Get the user's name and surname separately in the main method
      // Create a method that returns:
        //  first letters of first and last name as capitals and
        //  rest should be in lower case
       // input : name : Ali surname :YILMAZ
       // output : Ali Yilmaz
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();
        System.out.println("enter your surname");
        String surname=scan.nextLine();
        System.out.println(best(name, surname));

    }
    public static String best(String name,String surname) {
        String newName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()+" "
         + surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        return  newName;
    }
}
