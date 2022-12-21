package days.day6_ifElseStatement;

import java.util.Scanner;

public class C011_NestedIfElse {
    public static void main(String[] args) {
        // Question 3- Get the number of products purchased from the user and the list price, and ask the user
        //if they have a customer card. If the customer has a card and buys more than 10 items 20% off
        // otherwise 15% off.
        //If the customer does not have a card,
        // 15% off if he buys more than 10 products, 10% off if he does not
        Scanner scan = new Scanner(System.in);
        System.out.println("Urun adetini gir");
        int urunAdeti = scan.nextInt();
        System.out.println("urunun liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();
        System.out.println("Musteri kartiniz var mi?\n E:Evet,  H:Hayir");
        char kartVarmi = scan.next().charAt(0);
//Urun miktari ana degisken olsun

        if (urunAdeti > 10) {
            if (kartVarmi == 'E' || kartVarmi == 'e')
                System.out.println("%20 indirimli toplam fiyat:  " + urunAdeti * listeFiyati * 0.80);
            else if (kartVarmi == 'h' || kartVarmi == 'H')
                System.out.println("%15 off total price: " + urunAdeti * listeFiyati * 0.85);
            else System.out.println("Htali kart bilgisi");
        } else if (urunAdeti > 0) {// urun sayisi 0-10 arasinda
            if (kartVarmi == 'E' || kartVarmi == 'e')
                System.out.println("%15 indirimli toplam fiyat:  " + urunAdeti * listeFiyati * 0.85);
            else if (kartVarmi == 'h' || kartVarmi == 'H')
                System.out.println("%10 off total price: " + urunAdeti * listeFiyati * 0.90);


        } else {// urun sayisi 0 veya daha az
            System.out.println("Hatali urun adeti");
        }
    }}

