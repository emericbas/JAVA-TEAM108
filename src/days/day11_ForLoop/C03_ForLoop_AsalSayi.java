package days.day11_ForLoop;

public class C03_ForLoop_AsalSayi{
    public static void main(String[] args) {
        //input olarak verilen bir tamsayinin
        // asal sayi olup olmadigini yazdirin

        int input=29;
        String sonuc="Sayi asal";
        for (int i = 2; i < input; i++) {
            if (input%i==0){
                sonuc="sayi asal degil";
                break;//Java bir loop'un icerisinde "break" gorurse o loop'u bitirir
            }

        }
        System.out.println(sonuc);
    }
}
