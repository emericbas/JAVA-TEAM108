package days.day12_MethodCreation;

public class C03_AsalSayi {
    public static void main(String[] args) {
        // verilen bir sayinin asal olup olmadigini
        // true,false olarak donduren bir method olusturun

        //asalSayiMI methodu bir boolean bir sonuc dondurdugunden bu methodu calistirdigimizda ya direk yazdirmaliyiz veya
        System.out.println(asalSayiMi(34));
        // method call'un getirecegi donucu atamak icin bir variable olusturabilirim
        boolean asalSayiMi= asalSayiMi(34);
    }
    public static boolean asalSayiMi(int input){
        boolean asalSayiMi=true;
        for (int i = 2; i <input ; i++) {
            if(input%i==0){//eger burasi calisirsa asal sayi degil
                asalSayiMi=false;
                break;

            }

        }
        return asalSayiMi;
    }
}
