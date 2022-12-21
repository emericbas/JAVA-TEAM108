package days.day18_ArrayList;


import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
//Create a method that increases the values of a list by 5;
List<Integer>list=new ArrayList<>();
list.add(23);
list.add(12);
list.add(11);
        System.out.println(PlusFive(list));//[28, 17, 16]
    }
    public static List<Integer> PlusFive(List<Integer>list){
        for (int i = 0; i <list.size() ; i++) {
           list.set(i,list.get(i)+5);
        }
        return list;
    }

    }

