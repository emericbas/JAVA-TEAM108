package days.day18_ArrayList.Questions;

import java.util.ArrayList;
import java.util.List;

public class Question4_Fibonacci {
    public static void main(String[] args) {
       // Question 4- Take a given positive integer n,
        // create a method that returns us the first n Fibonacci numbers as a list
        System.out.println(Fibonacci());
    }
    public static List<Integer> Fibonacci(){
        int sayi=10;//0 1 1 2 3 5 8 13.....
        List<Integer>Fibonaccilist= new ArrayList<>();
       Fibonaccilist.add(0);
        Fibonaccilist.add(1);
        Fibonaccilist.add(1);
        int sayi1=0;
        int sayi2=1;
        int sayi3=1;
        for (int i = 4; i <=sayi ; i++) {
            sayi1=sayi2;
            sayi2=sayi3;
            sayi3=sayi1+sayi2;
            Fibonaccilist.add(sayi3);


        }
        return Fibonaccilist;
    }
}
