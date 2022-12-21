package days.day18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_Soru4_FIbonacci {
    public static void main(String[] args) {
        // Question 4- Take a given positive integer n,
        // create a method that returns us the first n Fibonacci numbers as a list
int sayi=10;//o,1,1,2,3,5,8,13
        List<Integer>fibo=new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        int birinciSayi=0;
        int ikinciSayi=1;
        int ucuncuSayi=1;
        for (int i = 1; i <=sayi-2 ; i++) {
            ucuncuSayi=ikinciSayi+birinciSayi;
          birinciSayi= ikinciSayi;
ikinciSayi=ucuncuSayi;
fibo.add(ucuncuSayi);
        }
        System.out.println(fibo);




    }
}
