package days.day12_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // verilen iki sayiyi carpip sonucu yazdiran bir method olusturun.
        // (Class'in icinde ama main'in disinda olur_

        // Bir metthod ancak method call yapildiginda calisir
        //method call icin method adi ve parametrelere uygun argument yazilmalidir
        // method call icinde yazilan variable veya degerlere argument denir

        carpYazdir(5,8);//40.0
        carpYazdir(5.2,8.1);//42.12
    }
    public static void carpYazdir(double sayi1, double sayi2){
        System.out.println(sayi2 * sayi1);
    }
}
