package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class Questions15_16_17 {
    public static void main(String[] args) {

       /* Soru 15-)
        Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
                -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
                -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
        Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        Örn:
        isim1= masa
        isim2= ali
        Konsol => maalisa*/
        String isim1 = "symii";
        String isim2 = "KU";
        if (isim1.length() % 2 == 0) {
            System.out.println(isim1.substring(0, isim1.length() / 2) + isim2 + isim1.substring(isim1.length() / 2));
        } else {
            System.out.println("isim2 isim1'e eklenemez");
        }
        System.out.println("--------------");
       /* Soru 16-)  Kullanıcıdan en az 5 harfli bir kelime alın. Alınan kelimenin son 3 harfinin 2 kopyasından oluşan
       yeni bir String oluşturun ve konsolda yazdırın
        Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
        Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                Loopun içerisinde StringM methodlarından  yararlanalım!*/
        String kelime = "weropir";
        while (kelime.length() <= 5) {

            System.out.println("Yeni bir kelime giriniz");
            break;
        }
        if (kelime.length() > 5) {
            System.out.println(kelime.substring(kelime.length() - 3) + kelime.substring(kelime.length() - 3));
            System.out.println("----------------------------------");
       /* Soru 17-)
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
                Örnek:
        char ch1='a'
        String name ="Ali bakkala geç gitti."
        Beklenen Çıktı= a sayısı = 3
        Ipucu:
        Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz! Sayac adlı bir int variable oluşturarak
        bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz
*/
            Scanner scan = new Scanner(System.in);
            System.out.println("Bir isim giriniz");
            String isim = scan.nextLine();
            System.out.println("Bir karakter giriniz");
            char chr = scan.next().charAt(0);
            int counter = 0;
            int aranan = isim.length()-1;
            while (aranan >= 0) {
                if (isim.substring(aranan,aranan+1).charAt(0)==(chr)) {
                    counter++;
                }
                aranan--;
            }
            System.out.println(isim + " icerisinde " + counter + " tane " + chr + " bulundurur.");        }
    }
}