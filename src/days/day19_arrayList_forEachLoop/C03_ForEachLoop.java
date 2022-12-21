package days.day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        /*
        Eger coklu element iceren bir yapidaki tum elementlere
         ayni islemi yapmak istiyorsak
         index'ten bagimsiz olarak for each loop kullanilabilir

         for each loop'ta 3 seyi belirtmemiz lazim
         1-getirilecek elementlerin data turu
         2-getirilen elemente  verilecek isim,(genelde each /w kullanilir)
         3-Nereden getirilecegi
         */


        int[]arr={2,4,6,8,1};
        //bu array'in tum elementlerini yazdiralim

        for (int each:arr
             ) {
            System.out.print(each+" ");
        }
        System.out.println();
        //tum elementleri toplayalim
        int toplam=0;
        for (int each:arr
             ) {
           toplam+=each;
        }
        System.out.println("toplam = " + toplam);

        //tum sayilarin karelerini toplayalim
        toplam=0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("kareler toplami = " + toplam);
    }
}
