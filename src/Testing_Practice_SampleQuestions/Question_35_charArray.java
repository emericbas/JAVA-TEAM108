package Testing_Practice_SampleQuestions;

import java.util.Arrays;

public class Question_35_charArray {
    public static void main(String[] args) {
        //Soru 35-)
        //  Parametre olarak bir isim kabul eden ve
        //  ismi bir char Array dizisi olarak yazdıran bir method Return edin.
        //  String isim=   "Yakup";
        // char arr[]:     [Y,a,k,u,p]
        //   İpucu: Bir method içerisinde Array oluşturun ve
        //   aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

        String isim = "Yakup";
        System.out.println(Arrays.toString(isimChar(isim)));
    }

    public static char[] isimChar(String isim) {
        char[] arr = new char[isim.length()];
        for (int i = 0; i < isim.length(); i++) {
            arr[i] = isim.charAt(i);
        }
        return arr;

    }
}



