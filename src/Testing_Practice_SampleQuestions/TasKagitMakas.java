package Testing_Practice_SampleQuestions;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public static void main(String[] args) {
        //Tas,kagit,makas oyununda
        // Bilgisayara karsi 5 puana ilk ulasan oyunu kazanir
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoise = 0;
        int compiterChoise = 0;
        int user = 0;
        int comp = 0;


        do {
            System.out.println("Asagidakilerden birini seciniz\n" + "1 -Tas\n" + "2 -Kagit\n" + "3 -Makas");
            userChoise = scan.nextInt();
            compiterChoise = random.nextInt(3) + 1;//bilgisayarin secimi
            //karsilastirma ve puanlamasi

            switch (compiterChoise) {
                case 1 -> System.out.println("======== Bilgisayar = Tas ========");
                case 2 -> System.out.println("======== Bilgisayar = Kagit =========");
                case 3 -> System.out.println("======== Bilgisayar = Makas ==========");
            }

            switch (userChoise) {
                case 1 -> System.out.println("======== Oyuncu = Tas ========");
                case 2 -> System.out.println("======== Oyuncu = Kagit =========");
                case 3 -> System.out.println("======== Oyuncu = Makas ==========");
            }
            // Karsilastirmasi ve puanlamasi

            if (userChoise == 1 && compiterChoise == 2) {
                System.out.println("Kagit Tasi sarar! -- Bilgisayar +1 --");
                comp++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);

            } else if (userChoise == 1 && compiterChoise == 3) {
                System.out.println("Tas Makasi kirar! -- Oyuncu +1 --");
                user++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);

            } else if (userChoise == 2 && compiterChoise == 1) {
                System.out.println("Kagit Tasi sarar! -- Oyuncu +1 --");
                user++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);

            } else if (userChoise == 2 && compiterChoise == 3) {
                System.out.println("Makas Kagidi keser! -- Bilgisayar +1 --");
                comp++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);

            } else if (userChoise == 3 && compiterChoise == 1) {
                System.out.println("Tas Makasi kirar! -- Bilgisayar +1 --");
                comp++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);

            } else if (userChoise == 3 && compiterChoise == 2) {
                System.out.println("Makas Kagidi keser! -- Oyuncu +1 --");
                user++;
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);

            } else {
                System.out.println("Berabere!");
                System.out.println("Oyuncu = " + user + " // Bilgisayar = " + comp);
            }
        } while (user != 5 && comp != 5);
        {
            // Kazanani gosterelim
            if (user > comp)

                System.out.println("====================================" +
                        "Sen kazandin!!!!!!" +
                        "==================================");
            else
                System.out.println("====================================" +
                        "Malesef kaybettin!!!!!!" +
                        "===================================");
        }
        ;

        scan.close();
    }


}
