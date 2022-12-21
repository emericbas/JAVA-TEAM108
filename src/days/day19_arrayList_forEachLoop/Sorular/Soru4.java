package days.day19_arrayList_forEachLoop.Sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
      //  Question 4- Take a sentence and a letter from the user,
        //  print how many times the letter is used in the sentence,
        //  if not, print “the letter is not used in the sentence”
       String str="Java cok korkuncsun kusura bakma";
       String aranan="x";

        String[] bolunmus = str.split("");
        int counter=0;
        for (String each:bolunmus
             ) {
            if (each.equals(aranan)) {
                counter++;


            }}System.out.println(counter);
        if(counter==0)
        { System.out.println("not used " + aranan + " bulunamadi");
            }

        }}



