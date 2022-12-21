package days.day16_Arrays.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question5KullaniciyaArrayOlustrma {
    public static void main(String[] args) {
       // Question 5- Create a method that takes the size and elements of the array from the user and
        // creates the array and
        // returns it to us.
       int[] kullaniciArrrayi=arrayOlustur();//atama
        System.out.println(Arrays.toString(kullaniciArrrayi));
    }
    public static int[] arrayOlustur(){
      Scanner scan=new Scanner(System.in);
        System.out.println("olusturulacak array'in boyutunu giriniz");
        int length= scan.nextInt();
        int[] kullaniciArrayi=new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("array'e eklenecek bir sayi giriniz");
            kullaniciArrayi[i]=scan.nextInt();
        }return  kullaniciArrayi;
    }
}
