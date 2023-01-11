package days.day12_methodCreation;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {
        //Kullanicidan iki sayi ve istedigi islemi alin.(+,/,*-)
        // Bir method  olusturup sayilari istenen isleme tabi tutup
        // sonucu bize dondurun
        //kullanici islemi yanlis secmisse 0 dondurun
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        System.out.println("bir islem secin +, _, /, *");
        char islem = scan.next().charAt(0);

        System.out.println(hesapMakinesi(number1, number2, islem));

    }

    public static double hesapMakinesi(double number1, double number2, char islem) {
        switch (islem) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '/':
                return number1 / number2;
            case '*':
                return number1 * number2;

            default:
                return 0;

        }

    }
}