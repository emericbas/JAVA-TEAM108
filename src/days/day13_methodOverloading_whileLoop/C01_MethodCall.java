package days.day13_methodOverloading_whileLoop;

import days.day12_methodCreation.C03_AsalSayi;
import days.day12_methodCreation.C07_TerseCevirme;
import days.day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {
        //ilk 15 fibonacci sayisini yazdirin
        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);
      //
        //  0 11 2 3 5 8 13 21 34 55 89 144 233 377

        //cumleyi tersine cevirelim
        String str="Bir kere yazalim,rahat edelim";
        System.out.println(C07_TerseCevirme.metniTerseCevir(str));//milede tahar,milazay erek riB
        //atama yap derse
        String reverseStr=C07_TerseCevirme.metniTerseCevir(str);

        //asagidaki cumlenin palindrome olup olmadigini yazdirin
        str="Java candir";
        reverseStr=C07_TerseCevirme.metniTerseCevir(str);//ridnac avaJ
        if (str.equals(reverseStr)){
            System.out.println("palindrome");
        }else {
            System.out.println("polindrome degil");
        }
        System.out.println("-----------------------------");
        //asagidaki sayi asal mi
        int sayi=23;
        System.out.println(C03_AsalSayi.asalSayiMi(sayi));//true
        //kullanici true, false'dan birsey anlamaz acik yazalim dersek
        //sonucu kaydedip, if cumlesiyle goster
        boolean result=C03_AsalSayi.asalSayiMi(sayi);//true
        if(result){
            System.out.println("Girilen "+ sayi  +" asal");
        }else{
            System.out.println("Girilen "+ sayi  +" asal degil");
        }
    }
}
