package days.day10_stringManipulation;

public class C06_Soru4 {
    public static void main(String[] args) {
        // Question 4 : Ask the user for a password, check the following terms and tell the user any missing
        // terms that need to be corrected, if it satisfies all conditions, print "password saved successfully"
        //         - the first letter must be lowercase
        //         - the last character must be a number
        // - the password must not contain spaces
        //         - the length must be at least 10 characters*/

/* Eger if-else ile yaparsak ilk hatada hatayi bulup digerlerini yazdirmaz.
Avantaji ise eger hata yoksa otomatik olarak basarili sekilde olusturuldu diyebilir

Bagimsiz if cumlelerinde tum hatalari bir kerede soyleyebiliriz
ancak bagimsiz if cumleleri kodun geriye kalani ile ilgilenmediginden
 basarili sifre olusturuldugunu bizim ayri bir mekanizma ile kontrol etmemiz gerekir
 */
        /*sonuc'ta  bir sifre olusturuldu demek icin bir kontrol mekanizmasi olusturmamiz gerekir
        Ya her aimda artiaracagimiz bir sayac yapip en son 4 oldu ise basarili deriz
        ya da basta verdigimiz deger olumsuz bir durum oldugunda artirilir
        ensonda kontrol edip eger bastaki degeri hala koruyorsa basarili olmustur deriz
         */
        String sifre="abc31233";
        int flag=0;
        //  - the first letter must be lowercase
if(!(sifre.charAt(0)>='a' &&sifre.charAt(0)<='z')){
    System.out.println("ilk harf kucuk olmali");
    flag++;//bir ceza puani aldi
}
//  - the last character must be a number
        if(!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("son karakter rakam olmali");
            flag++;//
            // - the password must not contain spaces
        } if (sifre.contains(" ")) {
                System.out.println("sifre bosluk icermemeli");
                flag++;
            }
            //         - the length must be at least 10 characters*/
            if (!(sifre.length() >= 10)) {
                System.out.println("sifeninn uzunlugu 10 karakter olmali");
                flag++;
            }
            if (flag == 0) {
                System.out.println("sifreniz basariyla kaydedildi");
            }
        }

    }

