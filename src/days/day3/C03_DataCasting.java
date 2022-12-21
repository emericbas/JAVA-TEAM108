package days.day3;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        System.out.println(28/5);//5
        System.out.println(29/3);//9
        //Java bir bolme isleminde iki integer isleme giriyorsa sonucu int olarak verir round yapmaz
        int num1=25;
        int num2=6;
        System.out.println(num1/num2);//4
        //Decimal bulmak istiyorsan enaz birini double yapmalisin
        double dbl=6;
        System.out.println(num1/dbl);
        //QUESTION
        // 2 tamsayi al.1.yi 2.ye bol
        Scanner scan=new Scanner(System.in);
        System.out.println("Plese enter two numbers");
        int firstNumber= scan.nextInt();
        int secondNumber= scan.nextInt();
        System.out.println("iki sayinin bolme sonucu=" +(double)firstNumber/secondNumber);
    }
}
