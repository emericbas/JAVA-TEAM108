package days.day10StringManipulation;

public class C10_ForLoop {
    public static void main(String[] args) {
        //input olarak verilen sayidan baslayarak
        // 7'ser  7'ser artirarak input olarak verilen bitis sayisina kadar
        // tum sayilari kac adet bsayi oldugunu ve
        // bu sayiarin toplaminin kac oldugunu yazdirin
        int inputBas= 34;
        int inputBit= 563;
         int sayac=0;
         int toplam=0;
        for (int i = inputBas; i <=inputBit ; i+=7) {
             System.out.print(i+ " ");
            sayac++;
            toplam+=i;

        }
        System.out.println(" "); //altsatira geciriyor
        System.out.println("Toplam "+sayac +" adet sayinin toplami :"+ toplam );
    }
}
