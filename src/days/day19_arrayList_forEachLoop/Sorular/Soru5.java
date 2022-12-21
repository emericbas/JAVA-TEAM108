package days.day19_arrayList_forEachLoop.Sorular;

import java.util.ArrayList;
import java.util.List;

public class Soru5 {
    public static void main(String[] args) {
      // Question 5- Write a program that compares the elements of the two given arrays and returns the elements
      //  common to both of them as a separate list
        int[]arr1={3,4,5,5,6,7,8};
        int[]arr2={3,4,5,11,6,1,8};
        List<Integer>ekle=new ArrayList<>();
        for (int each:arr1
             ) {
            for (int each2:arr2
                 ) {
                if(each==each2){
                    if(!ekle.contains(each)) {
                        ekle.add(each);
                    }

                }
            }
        }
        System.out.println(ekle);
    }
}
