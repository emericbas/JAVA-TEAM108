package days.day3;

import java.util.Scanner;

public class C02_CharDataCasting {
    public static void main(String[] args) {
        /*
        char data turu nun extra ozellikleri vardir
        Eger matematiksel bir islemde char data turunden bir deger kullanirsaniz
        Java o char'in ascii tablosundaki degerini algilar
         */
        System.out.println('a'+'b');//97+98=195
        System.out.println('a'-32);//97-32=65
        //'a' -32 nin char olarak sonucunu yazdirin
        //once parantez icine al
        System.out.println((char)('a'-32));// A


        //  QUESTION//Kullanicidan bir char alip ascii tablodan kullanicinin girdigi char'in sonrasindaki 3 karakteri yazdirin.ornek input:a  output:b,c,d
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter one char");
        char enterChar=scan.next().charAt(0);
        System.out.println((char)(enterChar+1) +","+
        (char)(enterChar+2)+ ","+
        (char)(enterChar+3));

    }
}
