package GenelTekrar;

import java.util.Scanner;

public class ucgenOlusturma {
    public static void main(String[] args) {
        //kullanicidan 3 tane pozitif tam sayi alin.
        // Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz.
        // Eger ucgen olabiliyorsa ,es kenar ucgen olabilme durumunu da kontrol ediniz
        Scanner scan=new Scanner(System.in);
        System.out.println("3 tam sayi giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        if((a-b<c && c<a+b)&&(c-b<a && a<c+b) &&(c-a<b && b<c+a)){
            if(a==b && b==c){
                System.out.println("eskenar ucgen");
            }else System.out.println("normal ucgen");
        }else System.out.println("ucgen olusturulamaz");
    }
}
