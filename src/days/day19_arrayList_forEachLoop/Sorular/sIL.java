package days.day19_arrayList_forEachLoop.Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sIL {
    public static void main(String[] args) {
sum();
    }
    public static void  sum(){
        Integer [] arr={1,2,3,4};
        List<Integer> squares=new ArrayList<>();
        for (Integer each:arr
             ) {
          Integer arr1=each*each;
          squares.add(arr1);
        }

        System.out.println(squares);
    }

}
