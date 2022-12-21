package days.day6_ifElseStatement;

import java.util.Scanner;

public class C07_IfElseIfQuest2 {
    public static void main(String[] args) {
     //   Question 2- Ask for the user's weight (kg) and height (cm) and calculate the body mass index
     //   (weight * 10000 / (height * height))
        //   if the body mass index is greater than 30 obese,
       //   between 25-30 overweight,
        // between 20-25 normal,
        // if less than 20 print thin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Plesae enter your weight");
        double weight= scan.nextDouble();

        System.out.println("Plesae enter your height");
        double height= scan.nextDouble();

        double bmi=(weight *10000)/(height*height);
        System.out.println("The body mass index:  "+ bmi);
        if(bmi>=30) System.out.println("You are obese");
        else if (bmi>=25) System.out.println("Owerweight");
        else if (bmi>=20) System.out.println("Normal");
        else if (bmi<20) System.out.println("Thin");


    }
}
