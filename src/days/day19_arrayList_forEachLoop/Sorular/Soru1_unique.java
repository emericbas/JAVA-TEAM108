package days.day19_arrayList_forEachLoop.Sorular;

import java.util.ArrayList;
import java.util.List;

public class Soru1_unique {
    public static void main(String[] args) {
       // Question 1- For the repeating elements in a given array,
        // delete the duplicates,
        // make only one of all the elements,
        // assign the new version to the old array and print it
        int []arr={1,2,5,6,4,3,4,5,8,9,7};
        List<Integer>liste= new ArrayList<>();
        for (int each:arr
             ) {
           if(!liste.contains(each)){
               liste.add(each);
           }
        }
        System.out.println(liste);
    }
}
