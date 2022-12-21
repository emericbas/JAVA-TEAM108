package Testing_Practice_SampleQuestions;

import java.util.ArrayList;
import java.util.List;

public class Question_30 {
    public static void main(String[] args) {
      /*  Soru 30-)
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
       */

        String str="Javacokkolay";
        String[] arr=str.split("");
        List<String >tekrar=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {

           if(arr[i].equalsIgnoreCase(arr[i+1])){
               tekrar.add(arr[i]);

         }


        }System.out.println(tekrar);
    }
}
