package days.day16_arrays;

public class C06_SoruEnBuyukEnKucuk {
    public static void main(String[] args) {
        //Bir markestin fiyatlarini tutan bir array var.bu marketteki en yuksek ve en dusuk fiyatlari yazan bir method olusturun
        double[] abc={23, 34.5, 42.1, 5.7,3.4, 23.5};
        enYuksekEnDusukFiyatYazdir(abc);
    }public static void enYuksekEnDusukFiyatYazdir(double[]fiyatlar){
        double enDusukFiyat=fiyatlar[0];
        double enYuksekFiyat=fiyatlar[0];
        for (int i = 0; i <fiyatlar.length ; i++) {
            if(fiyatlar[i]<enDusukFiyat){
                enDusukFiyat=fiyatlar[i];
            }
           if(fiyatlar[i]>enYuksekFiyat) {
               enYuksekFiyat=fiyatlar[i];
           }
        }
        System.out.println("enYuksekFiyat = " + enYuksekFiyat);
        System.out.println("enDusukFiyat = " + enDusukFiyat);
    }
}
