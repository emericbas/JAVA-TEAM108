package days.day12_methodCreation;

public class C04_Factoriyel {
    public static void main(String[] args) {
        //verilen bir sayinin 15'ten kucuk bir pozitive bir tamsayi oldugunu kontrol edin
        // kucukse bir method olusturup ,faktoriyel degerini yazdirin
        //sayi istenen aralikta degilse uyari yazdirin
        int input=3;
        if(input>0 && input<15){
            factoriyelYazdir(input);
        }else{
            System.out.println("Girilen sayi 15'ten kucuk olmali");
        }

    }
    public static void factoriyelYazdir(int sayi){
        int factoryalSonucu=1;
        for (int i = sayi; i >=1; i--) {
            factoryalSonucu*=i;// her loop'da gelen sayiyi onceki deger ile carpalim

        }
        System.out.println("Girilen "+ sayi+ " icin faktoriyel: "+ factoryalSonucu);}

}
