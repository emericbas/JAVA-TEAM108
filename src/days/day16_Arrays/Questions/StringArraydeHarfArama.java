package days.day16_Arrays.Questions;

import java.util.Arrays;

public class StringArraydeHarfArama {
    public static void main(String[] args) {
        String str = "Java is very very beautiful";
        //let's find how many "e" it has
        String[]arr=str.split("");
        System.out.println(Arrays.toString(arr));//[J, a, v, a,  , i, s,  , v, e, r, y,  , v, e, r, y,  , b, e, a, u, t, i, f, u, l]
        int counter=0;
        for (String each:arr
             ) {
            if(each.equals("e")){
                counter++;

            }
        }
        System.out.println( counter);
        System.out.println("--------------------");

        arr=str.split("e");
        System.out.println(Arrays.toString(arr));//[Java is v, ry v, ry b, autiful]
        System.out.println("there are  "+(arr.length-1)+"  e in the array");

}}