package Testing_Practice_SampleQuestions;

import java.util.Locale;
import java.util.Scanner;

public class Question11_12 {
    public static void main(String[] args) {
       /* Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                Ad ve soyadın baş harfleri büyük olmalıdır
        Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
                Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
                Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        Giriş :
		 > Gandalf Grey 563245879632
        Çıktı :
		 > İsim : G****** G***
		 > CCN : **** **** 9632 (edited)*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi,soyadinizi ve kredi karti numaranizi girin");
        String ad = scan.nextLine();
        String soyad = scan.nextLine();
        String kartNo = scan.nextLine();

        if (kartNo.length() != 16) {
            System.out.println("Gecersiz numara");
        } else {
            System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1).replaceAll("\\w","*") +
                    " " + soyad.substring(0, 1).toUpperCase() + soyad.substring(1).replaceAll("\\w", "*"));
            System.out.println(kartNo.substring(0,4).replaceAll("\\d","*")+" "+
                    kartNo.substring(5,9).replaceAll("\\d","*")+ " "+kartNo.substring(11,15));


              /*  Soru 12-)
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım

        Ipucu:  IF/Else kullanabilirsiniz.e
                Örnek:
        İki tamsayı girin:
        25  veya  4567986321453
        46   veya 123456
        Konsolda Çıktı :
        Sayıların toplamı: 71  veya  Fazla Yüklenme (edited)*/
            System.out.println("--------------------------------------------------");
            int number1=1230000000;
            int number2=123456;
            int sumOfNumber=number1+ number2;
            if(((number2+number1)+"").length()>=10 || (number2+"").length()>=10 ||(number2+"").length()>=10){
                System.out.println("Fazla Yuklenme");
            }else{
                System.out.println(sumOfNumber);
            }

        }
    }
}