package Testing_Practice_SampleQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BakkalinYediGunlukKazanci {
    public static void main(String[] args) {
        /*
        Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
        yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
        method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
        gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
        kazandığını gösteren bir method yazınız.

        * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp
         gunlukKazanclar ArrayList'e ekle.
        4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
        5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
          ortalama kazançtan yüksekse o günleri return yap.
        6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        ortalama kazançtan aşağıysa o günleri return yap.

         */
        List<String> weekDays = Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pazartesinden baslayarak gunluk kazancinizi listeye ekleyin");
        double kazanc = 0;
        List<Double> gunlukKazanc = new ArrayList<>();

        for (int i = 0; i < weekDays.size(); i++) {

            for (String each : weekDays) {
                System.out.print(each + "= ");
                gunlukKazanc.add(scan.nextDouble());
            }
            break;
        }

        double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanc);
        System.out.println("ortalama gunluk kazanciniz= " + ortalamaKazanc);
        System.out.println("ortalamanin ustunde kazandigin gunler= " + getOrtalamaninUstundeKazancGünleri(gunlukKazanc, weekDays, ortalamaKazanc));
        System.out.println("ortalamanin altinda kazandigin gunler= " + getOrtalamaninAltindaKazancGünleri(gunlukKazanc, weekDays, ortalamaKazanc));
    }

    public static double getOrtalamaKazanc(List<Double> gunlukKazanc) {
        double toplam = 0;
        double ortKazanc = 0;
        for (Double each : gunlukKazanc) {
            toplam += each;
            ortKazanc = toplam / gunlukKazanc.size();
        }
        return ortKazanc;
    }
    public static List<String> getOrtalamaninUstundeKazancGünleri(List<Double> gunlukKazanc, List<String> weekDays, double ortalamaKazanc) {
        List<Double> ortUstKazancGunList = new ArrayList<>();
        List<String> gun = new ArrayList<>();
        for (int i = 0; i < weekDays.size(); i++) {
            if (gunlukKazanc.get(i) > ortalamaKazanc) {
                gun.add(weekDays.get(i));
            }
        }
        return gun;
    }

    public static List<String> getOrtalamaninAltindaKazancGünleri(List<Double> gunlukKazanc, List<String> weekDays, double ortalamaKazanc) {
        List<String> gun = new ArrayList<>();
        for (int i = 0; i < weekDays.size(); i++) {
            if (gunlukKazanc.get(i) < ortalamaKazanc) {
                gun.add(weekDays.get(i));
            }
        }
        return gun;
    }
}
