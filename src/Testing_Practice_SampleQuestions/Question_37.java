package Testing_Practice_SampleQuestions;

import days.day18_ArrayList.C03_remove_ForIntegers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_37 {
    public static void main(String[] args) {
      /*  Soru 37-)
        --BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
                (Eliminate duplicates)
        ENG:
        Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
        Write a test program that reads in ten integers, invokes the method, and displays the result.
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
                On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
                ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
      */
int []arr=  {1 ,2 ,3 ,2 ,1 ,6 ,3 ,4 ,5 ,2};
        System.out.println(Arrays.toString(unique(arr)));
    }public static int[]unique(int[]arr){
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
          if(!list.contains(arr[i])){
              list.add(arr[i]);
          }
        }int []tekrarsiz=new int[list.size()];
        for (int i = 0; i <tekrarsiz.length ; i++) {
            tekrarsiz[i]=list.get(i);
        }return tekrarsiz;
    }
}
