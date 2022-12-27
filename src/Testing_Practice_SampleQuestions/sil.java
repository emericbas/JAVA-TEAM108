package Testing_Practice_SampleQuestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sil {
  public static void main(String[] args) {
        /*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.


countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0

         */
    String hi = "AB78Chi hi9";// → 2
    int counter = 0;
    String str = hi.replaceAll("\\d", "");
    str = str.replace("hi", "6");
    System.out.println(str);
//    for (String each : str
//    ) {
  //    if (each.equals("6")) {


        counter++;

      }
    //  System.out.println(counter);
    }








