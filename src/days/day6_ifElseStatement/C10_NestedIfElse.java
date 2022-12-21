package days.day6_ifElseStatement;

import java.util.Scanner;

public class C10_NestedIfElse {
    public static void main(String[] args) {
        // Question 3- Get the number of products purchased from the user and the list price, and ask the user
        //if they have a customer card. If the customer has a card and buys more than 10 items 20% off
        // otherwise 15% off.
        //If the customer does not have a card,
        // 15% off if he buys more than 10 products, 10% off if he does not
        Scanner scan =new Scanner(System.in);
        System.out.println("Urun adetini gir");
        int urunAdeti= scan.nextInt();
        System.out.println("urunun liste fiyatini giriniz");
        double listeFiyati= scan.nextDouble();
        System.out.println("Musteri kartiniz var mi?\n E:Evet,  H:Hayir");
        char kartVarmi=scan.next().charAt(0);

        // kart ana degisken olsun

        if(kartVarmi=='E' || kartVarmi=='e') {// kart var
            if (urunAdeti<=0) System.out.println("gecersiz urun miktari");
            else if (urunAdeti>10) System.out.println("%20 indirimli toplam fiyat  :"+urunAdeti*listeFiyati);
            else System.out.println("%15 indirimli toplam fiyat: " +urunAdeti*listeFiyati*0.85);


        } else if(kartVarmi=='h' || kartVarmi=='H') {  // kart yok
            if (urunAdeti<=0) System.out.println("gecersiz urun miktari");
            else if (urunAdeti>10) System.out.println("%15 indirimli toplam fiyat  :"+urunAdeti*listeFiyati);
            else System.out.println("%10 indirimli toplam fiyat: " +urunAdeti*listeFiyati*0.85);

        }else System.out.println("kart bigidi gecersiz");   // hatali kart bilgisi
        }

    }

