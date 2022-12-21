package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class Question_23_Faktoriyel {
    public static void main(String[] args) {
     /*  Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=6*5*4*3*2*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        int number=scan.nextInt();
      //  System.out.println( factoriyel(number));
    }

   public static String  factoriyel(int number) {
       String factoriyelSonuc = "";
       int factoriyel = 1;
       for (int i = number; i > 0; i--) {

         factoriyelSonuc = i+"*";
           factoriyel *= i;
       }//OLMADIIIIIIIIIIIIIIIIIIIII


     return factoriyelSonuc ;

   }
}