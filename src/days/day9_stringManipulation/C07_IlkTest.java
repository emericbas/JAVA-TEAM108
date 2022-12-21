package days.day9_stringManipulation;

public class C07_IlkTest {
    public static void main(String[] args) {
       //Gittigimiz web sayfasinda aldigimiz
        // string  arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin

        String input="1-48 of 87 results for \"nutella\"";
        //once 87'yi String olarak bul
       int indexOf=input.indexOf("of");
       int indexResults=input.indexOf("results");
       String sonucSayisiString=input.substring(indexOf+3,indexResults-1);
        //arama sayisinin 50'den fazla oldugunu test edin
       //87 burada string,
        // onu intger e cevirmek icin wrapple kullanacagiz
        int sonucSayisiInt=Integer.parseInt(sonucSayisiString);//parseInt string i integer a cevirir
        if(sonucSayisiInt>50){
            System.out.println("Nutella arama testi passed");
        }else{
            System.out.println("TESt failled");
        }




    }
}
