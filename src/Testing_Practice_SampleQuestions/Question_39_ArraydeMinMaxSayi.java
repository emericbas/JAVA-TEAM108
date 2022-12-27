package Testing_Practice_SampleQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_39_ArraydeMinMaxSayi {
    public static void main(String[] args) {
      /*  Soru-39)
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve
         verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
        Örnek:
        Input : {3,2,5,4,1,-6}
        Output :
        min: 1
        max: 6
        Ipucu: sort yöntemni kullanabilirsiniz.

       */
        int[]  arr={3,2,5,4,1,-6};
        minMaxSayilar(arr);
    }

    private static void minMaxSayilar(int[]arr) {


        Arrays.sort(arr);
       System.out.println("minSayi : "+arr[0]);
        System.out.println("maxSayi : "+arr[arr.length-1]);
    }
}
