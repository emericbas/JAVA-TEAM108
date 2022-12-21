package days.day5_ifStatement;

import java.util.Scanner;

public class C06_IfSttmentQuetion4 {
    public static void main(String[] args) {
        /*Kullanicidan bir ucgenin uc kenar uzunlugunu alin ;
        eskenar ucgen ise eskenar ucgen yazdirin

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin uc kenar uzunlugunu girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if(kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("Eskenar ucgen");}
    }
}
