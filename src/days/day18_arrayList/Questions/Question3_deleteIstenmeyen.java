package days.day18_arrayList.Questions;

import java.util.ArrayList;
import java.util.List;

public class Question3_deleteIstenmeyen {
    public static void main(String[] args) {
      //  Question 3- Create a method that deletes the elements containing unwanted letters in a given String
     //   list and returns the remaining part to us as a list.

        System.out.println(deleteOfElement());


    }public static List<String>deleteOfElement(){
        List<String>list=new ArrayList<>();
        list.add("a");
        list.add("k");
        list.add("b");
        list.add("b");
        list.add("h");
        List<String>istenmeyen=new ArrayList<>();
        istenmeyen.add("a");
        istenmeyen.add("b");
        list.removeAll(istenmeyen);
        return list;
    }





}
