package days.day10_stringManipulation;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {
        //kullanicidan baslangic ve bitis degerlerini alip sinirlar dahil olarak ,
        // bu sayilar arasinda 5'in kati sayilari yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.print("baslangic degerini alin");
        int baslangic= scan.nextInt();
        System.out.print("bitis degerini gir");
        int bitis= scan.nextInt();
        for (int i = baslangic; i <=bitis ; i++) {
           if(i%5==0){
               System.out.print(i +" ");
           }
        }
    }
}
