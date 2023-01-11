package days.day18_arrayList.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_6_positiveDivide {
    public static void main(String[] args) {
     //   Question 6- Create a method that takes a positive integer from the user and
        //   returns all positive integers that can divide that integer to us as a list
        System.out.println(bolunuyorMu());

    }
    public static List<Integer>bolunuyorMu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number= scan.nextInt();
        List<Integer>bolenler=new ArrayList<>();
        for (int i = 1; i <=number ; i++) {
            if(number%i==0){
                bolenler.add(i);
            }

        }
        return bolenler;

    }
}
