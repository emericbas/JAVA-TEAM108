package GenelTekrar;

import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        //bir dik ucgenin iki dik kenarini alarak hipotenusunu hesaplayan kod yaziniz
        Scanner scan= new Scanner(System.in);
        System.out.println("iki kenaar uzunlugu giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double hipotenus= Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println(hipotenus);
    }
}
