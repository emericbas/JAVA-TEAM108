package ProjeSorulari.OKUL_YONETIMI;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements IIslemler {
    Scanner scan = new Scanner(System.in);
    static int sicilNo = 1000;

    static ArrayList<Ogretmen> ogretmenList = new ArrayList<>();


    void ogrtMenu() {
        System.out.println("=============ÖĞRETMEN İŞLEMLERİ =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        int secim = 0;
        try {
            secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    ekleme();
                }
                case 2: {
                    arama();
                }
                case 3: {
                    listeleme();
                }
                case 4: {
                    silme();
                }
            }
        } catch (InputMismatchException e) {
            String kontrol = scan.next();
            if (kontrol.equalsIgnoreCase("q")) {
                AnaMenu anaMenu = new AnaMenu();
                anaMenu.menu();
            } else {
                System.out.println("HATALI GİRİŞ YAPILDI");
                ogrtMenu();
            }
        }
}

    @Override
    public void ekleme() {

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }
}
