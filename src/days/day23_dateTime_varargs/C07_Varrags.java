package days.day23_dateTime_varargs;

public class C07_Varrags {
    public static void main(String[] args) {
        // Kac tane String argument yazilirsa yazilsin
        // argumentlerin en uzun olanini yazdiran bir method olusturun.
        // Not: En uzun kelime olarak birden fazla kelime varsa ilkini yazdirin
        enUzunuYazdir("Ilyas","Berivana","Muratcan");
    }

    private static void enUzunuYazdir(String... kelimeler) {
        String enUzunKelime=kelimeler[0];
        for (String each:kelimeler
             ) {
            if(each.length()>enUzunKelime.length()){//>= enson each'i kabul eder
                enUzunKelime=each;
            }
        }
        System.out.println(enUzunKelime);
    }
}
