package GenelTekrar;

public class sayiRakamlariYazdir {
    public static void main(String[] args) {
        //verilen 12345  sayisinin rakamlarini yukaridan asagiya dogru yazdirin
        int sayi=12345;
        int birlerBasamagi=sayi%10;
        sayi=sayi/10;
        int onlarBasamagi=sayi%10;
        sayi=sayi/10;
        int yuzlerBasamagi=sayi%10;
        sayi=sayi/10;
        int binlerBasamagi=sayi%10;
        sayi=sayi/10;
        int onbinlerBasamagi=sayi%10;
        sayi=sayi/10;
        System.out.println(onbinlerBasamagi+"\n"+binlerBasamagi+"\n"+yuzlerBasamagi+"\n"+onlarBasamagi+"\n"+birlerBasamagi);
    }
}
