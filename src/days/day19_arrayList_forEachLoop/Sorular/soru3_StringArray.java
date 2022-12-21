package days.day19_arrayList_forEachLoop.Sorular;

import java.util.ArrayList;
import java.util.List;

public class soru3_StringArray {
    public static void main(String[] args) {
      //  Question 3- Checking each element in a given String array,
      //  - If the length of the word is an even number, return the first half
      //  - If the length of the word is an odd number, include the second half of the word, including the middle letter.
      // Add it to a new list and print it.

        String[]str={"ali", "veli", "emine","harran"};
        List<String>sonHali=new ArrayList<>();
        for (String each:str
             ) {
            if(each.length()%2==0){
               sonHali.add(each.substring(0,each.length()/2));
            }else {
               sonHali.add(each.substring(each.length()/2));
            }
        }
        System.out.println(sonHali);

    }
}
