package days.day11_forLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        //kullanicidan bir char alip
        // o karakterden sonra gelen 10 karakteri yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Please eneter a character");
        char girilenKarakter=scan.next().charAt(0);
        for (int i = 1; i <=10 ; i++) {
            System.out.print((char)(girilenKarakter+ i)+ " ");

        }
    }
}
