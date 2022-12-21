package days.day6_ifElseStatement;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {

        //question 1- Get the gender and age from the user. Female, 60 years old and over, Male 65 years
        // and older can retire. Print “You can retire” or “You need to work .. more years to retire”,
        // taking into account gender and age.

        /*
        eger degisken sayimiz birden fazla ise degiskenlerden birini oncelige alarak ,
        ona gore bir if else yapisi kurulur.
        bu sorua kadin/erkek secimini ana degisken yapalim
         */
        Scanner scan=new Scanner(System.in) ;
        System.out.println("Please enter your gender\nK;Kadin, E;Erkek");
        char gender=scan.next().charAt(0);
        System.out.println("Please enter your ages like an integer");
        int age= scan.nextInt();

        if(gender=='k' || gender=='K') {
            if(age>=80 || age<18) System.out.println("Gecersiz yas");
                else if(age>=60) System.out.println("Emekli olabilirsin");
                else System.out.println("Emekli olmak icin  "+ (60- age)+" yil calismalisin");

        }else if(gender=='e'||gender=='E') {
              if(age>=80 || age<18) System.out.println("Gecersiz yas");
              else if(age>=65) System.out.println("Emekli olabilirsin");
                else System.out.println("Emekli olmak icin "+ (65- age) +
                          "yil calismalisin");

        }else System.out.println("Gecersiz cinsiyet");

    }
}
