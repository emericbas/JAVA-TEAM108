package days.day5_ifStatement;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        //0-49,999 DD
        //50-65.999 CC
        //65-84.999 BB
       // 85-1000AA
        Scanner  scan=new Scanner(System.in);
        System.out.println("Please enter your note");
        double not=scan.nextDouble();

        if(0<=not && not<50){
            System.out.println("Your note is DD,failed");
        }
        if(50<=not && not<65){
            System.out.println("Notunuz CC,congrugalations you passed");}
        if(65<=not && not<85){
            System.out.println("Notunuz BB, gectiniz");}
            if(85<=not && not<=100){
                System.out.println("Notunuz AA ,gectiniz");}



    }
}
