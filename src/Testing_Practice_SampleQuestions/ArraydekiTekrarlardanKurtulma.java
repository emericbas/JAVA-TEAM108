package Testing_Practice_SampleQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArraydekiTekrarlardanKurtulma {
    //verilen bir arraydeki tekrar eden elementleri
    // sadece 1 kere yazarak array'i kisaltan kod yazin
    public static void main(String[] args) {


        int[] arr = {1, 2,8, 4, 3, 2, 5, 5, 6, 2, 3,8,7, 4, 5, 6};
        Set<Integer> arrset = new HashSet<>();
        for (Integer each:arr
             ) {
            arrset.add(each);
        }
        System.out.println(arrset);//[1, 2, 3, 4, 5, 6, 8] Bu set
        //set'teki element sayisina esit bir array olusturup
        // Set'teki elementleri array'e tasiyalaim
        arr=new int[arrset.size()]; //[0,0,0,0,0,0,0]
        int index=0;
        for (int each:arrset
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println("Array'in son hali: "+ Arrays.toString(arr));
    }
}