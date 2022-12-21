package days.day19_arrayList_forEachLoop.Sorular;

import java.util.Arrays;

public class ikiVArliginKacKEZkulCatDog {
    public static void main(String[] args) {
    //   write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence
      //  Ex:sentence = "caT dog dogG cAt"
      //  output:true
        String str="caT dog dogG cAt".toLowerCase();
        String cat="cat";
        String dog="dog";
        int countCat=0;
        int countDog=0;
        String[]aranan=str.split(" ");
        System.out.println(Arrays.toString(aranan));//[cat, dog, dogg, cat]
        for (String each:aranan
             ) {
            if(each.equals(cat)){
                countCat++;

            }if(each.equals(dog)){
                countDog++;
            }
        }
        System.out.println(countCat+" "+countDog);
    }
}
