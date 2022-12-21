package days.day6_ifElseStatement;

import java.util.Scanner;

public class C08_IfElseIfQues_3 {
    public static void main(String[] args) {
       /*
       Question 3- Get the number of products purchased from the user and the list price, and ask the user
       if they have a customer card. If the customer has a card and buys more than 10 items 20% off
       otherwise 15% off.
       If the customer does not have a card,
        15% off if he buys more than 10 products, 10% off if he does not
        NESTED IF ELSE IF ILE COZECEGIM INS
       Card i baz alacagim
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of products");
        int urunSayisi = scan.nextInt();
        System.out.println("Kart 'in var mi?");
        char card = scan.next().charAt(0);
        System.out.println(" urun fiyati ");
        double urunFiyati = scan.nextDouble();
        if (card == 'y' || card == 'Y'){
            if (urunSayisi > 10) System.out.println("%20 off price is " + (urunSayisi * urunFiyati * 0.80));
            else System.out.println("%15 off price is "+(urunSayisi * urunFiyati * 0.85));


        }else if (card=='n' || card=='N'){
            if (urunSayisi > 10) System.out.println("%15 off price is " + (urunSayisi * urunFiyati * 0.85));
            else System.out.println("%10 off price is "+(urunSayisi * urunFiyati * 0.90));

        }
    }
}