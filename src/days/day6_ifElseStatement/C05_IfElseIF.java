package days.day6_ifElseStatement;

import java.util.Scanner;

public class C05_IfElseIF {
    public static void main(String[] args) {
        //85 ve ustu AA
        //(85 ve ustu deglse) 65 ve ustu iseBB
        //(65 VE USTU DEGILSE) 50 Ve ustu ise CC
        //(Geriye kalanlar) DD

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your note");
        double note= scan.nextDouble();

        if(note<0|| note>100) {
            System.out.println("gecersiz note");
        }else if(note>=85) {
            System.out.println("Notunuz AA");
        }else if(note>=65) {
            System.out.println("notunuz BB");
        } else if (note>=50) {
            System.out.println("Notunuz CC");
        }else{
            System.out.println("Notunuz DD kaldiniz");
        }
    }
}
