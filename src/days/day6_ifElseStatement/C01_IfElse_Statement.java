package days.day6_ifElseStatement;

import java.util.Scanner;

public class C01_IfElse_Statement {
    public static void main(String[] args) {
        /* If ile baslayan bir kod else ile bitiyorsa
        input'un tum degerlerini kapsar
        yani her deger icin mutlaka kodumuzda bir body calisir
         */
        //Take three sides of a triangle. ikiz kenar ise ikizkenar degilse degil yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter theree side");
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double side3 = scan.nextDouble();

        if ((side1 == side2 && side1 != side3) ||
                (side3 == side2 && side2 != side1) ||
                (side1 == side3 && side3 != side2)) {
            System.out.println("Ikizkenar ucgen");
        } else {
            System.out.println("Ikizkenar degil");

        }
    }
}
