package Testing_Practice_SampleQuestions;

import java.util.Arrays;

public class
Question_36_ortadakiSayi {
    public static void main(String[] args) {
        //  Soru 36-)
        //Verilen bir Array dizisindeki ortadaki degeri döndüren
        // bir kod/method yazın.

        //Örnek:
        //inputarr[]=   {1,2,3,4,5,6,7}
        //output:         4

        int[]arr={1,2,3,4,5,6,7,8};
        System.out.println(OrtadakiSayi(arr));
    }
public static int OrtadakiSayi(int[]arr){
        int orta=0;
      if(arr.length%2!=0){
          orta=arr[arr.length/2];

      }return orta;
}

    }
