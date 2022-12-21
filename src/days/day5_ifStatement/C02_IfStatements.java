package days.day5_ifStatement;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        /* Take a number from the user
        if it is positive "positive number2,
        100 ile 999 arasinda ise (sinirlar dahil) "positive 3 basamakli sayi"
        3 ile bolunebiliyorsa " 3'un kati
        birler basamagi 7 ise "mukemmel sayi"
        seceneklerinden uygun olanlari yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int sayi = scan.nextInt();
        //positive ise
        if (sayi > 0) {
            System.out.println("positive sayi");
        }
        // 100 ile 999 arasinda ise(sinirlar dahil0 "positive 3 basamakli sayi"
        if (100 <= sayi && sayi <= 999) {
            System.out.println("positive uc basamakli sayi");
        }

        //3 ile bolunebiliyorsa " 3'un kati"
        if (sayi % 3 == 0) {
            System.out.println("3;un kati");
        }
        // birler basamagi 7 ise "mukemmel sayi"
        if (sayi % 10 == 7) {
            System.out.println("mukemmel");
        }
    }
}
