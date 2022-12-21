package days.day16_Arrays;

public class C07_Soru4ArananElemanKacKezVar {
    public static void main(String[] args) {
         //Question 4- Create a method that prints whether a desired element exists in a given array and,
        // if so,how many times it has been used.
         int[]arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
         int arananSayi=2;
      elemanBul(arr,arananSayi);//Aranan sayi 2 array'de 4 adet kullanilmistir
      elemanBul(arr,8);//Aranan sayi array'de yok
    }
    public static void elemanBul(int[] arr,int arananSayi){
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==arananSayi){
                sayac++;
            }
        }
        if(sayac==0){
            System.out.println("Aranan sayi array'de yok");
        }else{
            System.out.println("Aranan sayi "+arananSayi +" array'de "+ sayac + " adet kullanilmistir");
        }
    }



}
