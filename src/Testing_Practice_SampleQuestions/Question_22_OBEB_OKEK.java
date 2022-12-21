package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class Question_22_OBEB_OKEK {
    public static void main(String[] args) {
       /* Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("2 tamsayı giriniz");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        String str1="";
        String str2="";
        for (int i = 1; i <= number1; i++) {

            if (number1 % i == 0) {
               str1 = i + ",";
            }


        for (int j = 1; j <= number2; i++) {

            if (number2 % j == 0) {
                str2 = j + ",";
            }
        }
        System.out.print("number2'nin bolenleri= "+ str2);
            System.out.println();
        System.out.print("number1'in bolenleri= " + str1);}
    }
}
