package Testing_Practice_SampleQuestions;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println(Arrays.toString(str()));
    }public static String[]str() {
        String str = "Javacokkolay";
        String tekrar = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && !tekrar.contains(str.charAt(i) + "")) {

                tekrar += str.charAt(i);}
            }
        }  String[] yinelenenKararkter = tekrar.split("");
                return yinelenenKararkter;
            }
        }




