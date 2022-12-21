package days.day9_stringManipulation;

import java.util.Scanner;

public class stringdekiSayilariAlma {
    public static void main(String[] args) {
        String input="1-48 of 87 results 471 for \"nutella\"";
        /*
        int ofunyeri=input.indexOf("of");
        int resultyer=input.indexOf("results");
   String seksenyedi    = input.substring(ofunyeri+3,resultyer-1);

       System.out.println(Integer.parseInt(seksenyedi));*/
        int results=input.indexOf("results");
        int forun=input.indexOf("for");
        String dortyuzyetmisbir=input.substring(results+8,forun-1);
        System.out.println(Integer.parseInt(dortyuzyetmisbir));
        System.out.println("------------------------------------------------");
/* Question
price toplamini bul
*/

String str1="Price is 20000 euro";
String str2="Price is 25000 euro";
str1=str1.replaceAll("\\D","");
str2=str2.replaceAll("\\D","");
int str1Price=Integer.parseInt(str1);
int str2Price=Integer.parseInt(str2);
        System.out.println("Total price is "+(str1Price+str2Price ));
        System.out.println("------------------------------- ");
        String no1="300";
        String no2="30";
        System.out.println(no1 +no2);// 30030
       int valueNo1=Integer.parseInt(no1);
       int valueNo2=Integer.parseInt(no2);
        System.out.println(valueNo1+valueNo2);
    }
}