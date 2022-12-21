package Testing_Practice_SampleQuestions;

import java.util.Arrays;

public class Question_32_reverseArray {
    public static void main(String[] args) {
      //  Soru 32-)
      //  Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        //        İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...
int []arr={8,9,7,6};
int[]arrNew=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arrNew[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(arrNew));
    }
}
