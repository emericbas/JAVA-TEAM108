package GenelTekrar;

import java.util.Scanner;

public class isciProblemi {
    public static void main(String[] args) {
        //bir iscinin isi bitirme suresini, ve toplam isci sayisini alarak,
        // isin bitme suresini hesaplayan kodu yaziniz.
        // ORnegin ,bir isci bir isi 10 gunde yapabilmektedir.
        // Buna gore 2 isci kac gunde yapar?
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isci isi kac gunde bitiriyor?");
        double birIscininGunu=scan.nextDouble();
        System.out.println("kac isci calisacak?");
        int isciSayisi=scan.nextInt();
        double birlikteGunSayisi=birIscininGunu/isciSayisi;
        System.out.println(birlikteGunSayisi);
    }
}
