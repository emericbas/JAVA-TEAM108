package days.day30_interfaces_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class N01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        System.out.println(sayilar);//[5, 23, 2, 9, 11]

        // index yapisi kullanmadan tum elementleri 3 artirin

        for (Integer each:sayilar
             ) {
            System.out.print(each+3 +" ");//8 26 5 12 14
        }
        System.out.println("");
        System.out.println(sayilar);//atama yapmadigimiz icin [5, 23, 2, 9, 11]

        //index kullanmadan tum elementleri silin
        Iterator itr= sayilar.iterator();
        System.out.println(itr.next());//5 ilk sayiyi
        System.out.println(itr.next());//23 next sayiyi
        System.out.println(itr.next());//2 next sayiyi
        System.out.println(itr.next());// 9 next sayiyi
        System.out.println(itr.next());// 11

        //tek tek yapmayip bir loop ile yapalim

        //suan iterator 11 den sonraki enson yerde
        //neredeyse orada kalir,geri donmez
        System.out.println(itr.hasNext());//false
        //tum listeyi loop ile yeniden yazdirmak icin yeniden bir itr olusturmali veya
        // iterator'a yeni deger  atamaliyiz

        itr= sayilar.iterator();
        System.out.println(itr.hasNext());//true

        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        //iterator kullanarak listedeki 5'ten buyuk sayilari silin
        itr= sayilar.iterator();// iterator'i basa getirmek icin

        while ((itr.hasNext())){
            Integer sayi=(Integer) itr.next();
            if(sayi>5){
                itr.remove();
            }
            System.out.println("");
            System.out.println(sayilar);//[5,2]
        }


    }
}
