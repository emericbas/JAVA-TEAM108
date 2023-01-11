package days.day10_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1="";
        String str2="   ";
        String str3;
        String str4=null;
        System.out.println(str1.length());//0
        System.out.println(str2.length());//3
        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());//false
        System.out.println(str2.isBlank());//true
        System.out.println(str2.isBlank());//true

        // null bir deger degil, isaretcidir(null pointer)
        //null pointer:non primitivr bir objenin oludturldugunu
        // ancak bilincli olarak deger atanmadigini isaretler
// str4 'un degeri null'dir YANLIS,
// str4 null olarak isaretlenmistir cumlesi DOGRU

      //  System.out.println(str3.length());
      //  System.out.println(str3.concat("ali can"));
      //  System.out.println(str3.substring(3, 4));
        /*Java bir variable 'i olusturup deger atanmamasina izin verir.
        Bir variable 'i deger atamadan OLUSTURABILIRSINIZ ancak KULLANAMAZSINIZ,
         deger atanmayan bir variable'i kullanmaya kalkarsaniz Java CTE verir.

       !!!!!!!!  null String methodlariyla kullnilirsa null  pointer exception verir

         null pointer ise bu variable'a bir gdeger atanmadigini ve
          bunun bilincli bir tercih oldugunu Java'ya soyler
          dolayisiyla java kodlari calistirmaya devam eder.Ancak
         */
        str4= null;
        System.out.println(str4.length());// NullPointerException

    }
}
