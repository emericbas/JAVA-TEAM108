package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class Question_9_10 {
    public static void main(String[] args) {
       /* Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        Ipucu:
        Saati alıp saniyeye cevirebilirsiniz.  Kullanıcıdan ayrı ayrı alabilirsiniz veya  kullanıcıdan hepsini birlikte alabilirsiniz.
 */
        int saat=4;
        int dakika=39;
        int saniye=46;
        saat=60*60*saniye;
        dakika=60*saniye;


        System.out.println("4 saat 39 dakika 46 saniye: "+(saat+dakika+saat)+" saniye");
              /*  Soru 10-)  Klasik Soru :slightly_smiling_face:
        Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

                **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
                Kullanıcıya aşağıdaki gibi mesaj verin:

        Eğer VKİ 18.5'ten az ise --> zayıfsınız
        Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        VKİ 30'a eşit veya daha fazlaysa --> obez*/
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu  (kg) giriniz");
        double agirlik= scan.nextDouble();
        System.out.println("Lutfen boyunuzu (m) giriniz");
        double boy= scan.nextDouble();
        double vki=agirlik/(boy*boy);
        if(vki<18.5) {
            System.out.println("zayifsiniz,yerinizde olmayi cok isterdim");
        }else if(vki>=18.5 &&vki<25){
            System.out.println("ideal kilo");
        }else if (vki>=25 && vki<30){
            System.out.println("sizi anliyorum ,uzulmeyin,.");
        }else if (vki>=30){
            System.out.println("obezsiniz");

        }
    }
}
