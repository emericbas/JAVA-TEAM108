package days.day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Soru1_tekrarlananlariSil {
    public static void main(String[] args) {
        //Verilen bir array'deki tekrar eden elemenler icin,
        // tekrar edenleri silip,
        // tum elemanlardan sadece 1 tane yapip
        // eski array'e yeni halini atayip yazdirin.

        Integer[]arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer>list=new ArrayList<>();

        for (Integer each:arr
             ) {
            if(!list.contains(each)){
                list.add(each);
            }
        }
        //list olarak unique degerlerden olusan bir list olusturduk
        arr=new Integer[list.size()];
        //simdi list'deki elementleri array'e kopyaliyalim
        //array'e atama yapmak icin index'e ihtiyacigimiz oldugundan
        // for-each loop mantikli degil.
        // for loop daha pratik

        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i);

        }
        System.out.println(Arrays.toString(arr));//[2, 3, 4, 6, 1, 8, 5]
    }
}