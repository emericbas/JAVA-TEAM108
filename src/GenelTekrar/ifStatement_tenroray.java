package GenelTekrar;

import java.util.Scanner;

public class ifStatement_tenroray {
    public static void main(String[] args) {
        //kullanicidan alacaginiz 2  sayiyi alip,
        // yine kullaniciga sectireceginiz dort islemden birine gore
        // isleme koyup cozdurunuz
        Scanner scan =new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("islem giriniz :"+"\n 1= Toplama"+"\n 2=cikarma"+"\n 3=carpma"+"\n 4=bolme");
        char islem=scan.next().charAt(0);
        if(islem=='1'){
            System.out.println("toplama="+(sayi1+sayi2));

        }else  if(islem=='2'){
            System.out.println("cikarma="+ (sayi1-sayi2));
         }else  if(islem=='3'){
            System.out.println("carpma="+(sayi1*sayi2));
        }else  if(islem=='4') {
            System.out.println("bolme=" + (sayi1 / sayi2));
        }}}