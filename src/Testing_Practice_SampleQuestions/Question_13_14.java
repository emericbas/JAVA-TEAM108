package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class Question_13_14 {
    public static void main(String[] args) {
     /*   Soru 13-)
        Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
                Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
        Ipucu:
        Switch konusunu hatırlayalım!
                */
        char cevap='?';
        switch (cevap){
            case 'a': System.out.println("İsteğiniz işleniyor");break ;
            case 'b': System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");break ;
            case 'c': System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");break ;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }

        System.out.println("------------------------");
      /*  Soru 14-)
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
        Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
         İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
       değil ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
        Ipucu:
        IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.*/
Scanner scan=new Scanner(System.in);
        System.out.println("3 karakterli bir isim giriniz");
        String str=scan.next();
        if (str.charAt(0) == str.charAt(1) && str.charAt(0) == str.charAt(2)) {

            System.out.println("Dize yinelenen karakterlere sahip");
        }else{
            System.out.println("Dize benzersiz karakterlere sahip");
        }
     }
}
