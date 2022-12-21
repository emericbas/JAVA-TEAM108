package days.day12_MethodCreation.Questions;

public class Q1 {
    public static void main(String[] args) {
  // Question 1- Create a method that prints the letters in the String given as input from the user ,
        // including the starting index, excluding the ending index, according to the start and end indexes.
        //if the user enters a number greater than the end value as the start value, give an error message
        //- if the user enters an index larger than the length, print an error message.
       /* Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
         - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin
                */

        String input="java ne kadar guzel";
        int basIndex=5;
        int bitisIndex=7;
        substringMethodu(input,basIndex,bitisIndex);
        substringMethodu("java",3,5);
    }
    public static void substringMethodu(String input,int basIndex,int bitisIndex){
      if(basIndex>bitisIndex){
          System.out.println("Baslangic indexi ,bitis indexinden buyuk olamaz");
      }else if(bitisIndex>=input.length()){
          System.out.println("Bitis indexi Stringin sinirlarinin disinda");
      }else{
         // baslangic ve bitis indexlerine gore
        //  baslangic index'i dahil, bitis index'i haric olacak sekilde
          //  aradaki harfleri yazdiran bir method olusturun.
          for (int i = basIndex; i <bitisIndex ; i++) {
              System.out.print(input.charAt(i));

          }
          System.out.println("");

      }
    }
}
