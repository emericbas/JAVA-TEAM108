package days.day19_arrayList_forEachLoop.Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringIcicndeKelimeArama {
    public static void main(String[] args) {
// write a program that can return the frequency of the a word Java from the sentence
     //   Ex:sentence = "Java Java";
      //  output:2
     String str="Java Java";
     String ara="Java";
     String temp="";
     int counter=0;
   String[]aranan=str.split(" ");
        System.out.println(Arrays.toString(aranan));//[Java, Java]

        for (String each:aranan
             ) {
            if(each.equalsIgnoreCase(ara)){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
