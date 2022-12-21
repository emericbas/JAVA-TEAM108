package days.day12_MethodCreation;

public class C01_Method {
    public static void main(String[] args) {
        String str="Java'da yolu yariladik";
        str.isEmpty();// boolean sonuc dondu ama kullanmadik.
        // Method'un dondurdugu sonucu kullanmak istiyorsak ya yazdiririz
        System.out.println(str.isBlank());
        // ya da donen sonucu ileri de kullanacaksak atama yapariz
       boolean bl= str.isBlank();

     //   void= sadece yazdirir.5YAZDIKTAN SONRA DONDURULMEYECEGI ICIN ONCE DONDUR SONRA YAZDIR
    }
}
