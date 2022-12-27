package Testing_Practice_SampleQuestions;

import java.util.Arrays;

public class Question_41_IkiArraydenYeniArrayYapma  {
    public static void main(String[] args) {
      /*  Soru 41-)
        Parametre olarak 2 Int Array kabul eden ve
         2 Array listesini yeni bir Arraye ekleyen ve
          yazdıran bir method yazın.
                * Input1={1,2,3,4}
                * Input2={5,6}
                * Çıktı={1,2,3,4,5,6}

       */
        int [] input1={1,2,3,4};
       int[] input2={5,6};
       ikiArrayToplami(input1,input2);
    }
    public static void ikiArrayToplami(int[]input1,int[]input2){
       int []yeniArray=new int[input2.length+input1.length];
        for (int i = 0; i < input1.length; i++) {
            yeniArray[i]=input1[i];
        }
        for (int j = 0; j <input2.length ; j++) {
            yeniArray[input1.length+j]=input2[j];

        }
        System.out.println(Arrays.toString(yeniArray));
    }
}
