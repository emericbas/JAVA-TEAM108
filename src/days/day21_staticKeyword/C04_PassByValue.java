package days.day21_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {
        int fiyat = 100;
        //%10,%20,%30 indirim uygulayip indirimli fiyati  yazdiran 3 method olusturun

        indirimyap10(fiyat);//90
        indirimyap20(fiyat);//80
        indirimyap30(fiyat);//70
        System.out.println(fiyat);//100  onceki islemler fiyati degistirmez.
        // 4 tane fiyat variable'i var.
        // herkes kendi methodunda islem yapiyor isi bitince basa sariyor
    }

    public static void indirimyap10(int fiyat) {
        fiyat = fiyat * 90 / 100;
        System.out.println("%10 indirimli fiyat: " + fiyat);
    }

    public static void indirimyap20(int fiyat) {
        fiyat = fiyat * 80 / 100;
        System.out.println("%20 indirimli fiyat: " + fiyat);
    }

    public static void indirimyap30(int fiyat) {
        fiyat = fiyat * 70 / 100;
        System.out.println("%30 indirimli fiyat: " + fiyat);
    }
}