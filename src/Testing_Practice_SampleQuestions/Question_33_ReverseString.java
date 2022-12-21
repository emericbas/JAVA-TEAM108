package Testing_Practice_SampleQuestions;

import java.util.Arrays;

public class Question_33_ReverseString {
    public static void main(String[] args) {
       // Soru 33-)
     //   Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
        //Örnek:
       //String str="Coding is great.";
       // String arr[]: ".taerg si gnidoC"
       // İpucu: Önce Split kullanarak Arraye çevirin
        // ardından Loop kullanarak son karakterden başlayıp tersten yazdırın

        String str="Coding is great.";
          String [] parcala=str.split("");//[C, o, d, i, n, g,  , i, s,  , g, r, e, a, t, .]

        String reverse="";

        for (int i = parcala.length-1; i >=0 ; i--) {
            reverse+=parcala[i];

        }
        System.out.println("Reverse = "+reverse);
            }

        }


