package days.day18_ArrayList.Questions;

import java.util.ArrayList;
import java.util.List;

public class Question1_Unique{
    public static void main(String[] args) {
      //  Question 1- For the repeating elements in a given array,
        //  create a method that will delete the duplicates
      //  and make only 1 of all elements and return them to us
        System.out.println(unique());

    }
   public static List<String> unique(){
        String[] str={"a", "b", "g" , "f ","t","a","b","g"};
       List<String >unique =new ArrayList<>();
       for (String each:str) {
           if(!unique.contains(each)){
               unique.add(each);
           }

       }
       return unique;

   }
}
