package days.day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_SifreControl {
    public static void main(String[] args) {
        // Question 4 : Ask the user for a password, check the following terms and tell the user any missing
        // terms that need to be corrected, if it satisfies all conditions, print "password saved successfully"
        //         - the first letter must be lowercase
        //         - the last character must be a number
        // - the password must not contain spaces
        //         - the length must be at least 10 characters*/
// sifre kontrolunu bir method'dan yapip true/false dondurun
// main method'da donen sonucu kontrol edip
// "basarili ile olusturuldu" yazincaya kadar
// sifreyi tekrar tekrar isteyin
/*
        Scanner scan=new Scanner(System.in);
        boolean tekrarSifreIste=true;
        String sifre="";
        while (tekrarSifreIste) {

            System.out.println("enter your password");
            sifre= scan.nextLine();
            if (sifreKontrolEt(sifre)){//sifre kontrolu true donerse sifre basarili demektir
                System.out.println("basari ile olusturuldu");
                //break
                tekrarSifreIste=false;//break veya bu kod yazilabilir
        }
    }
    public static boolean sifreKontrolEt(String sifre){
        int flag=0;
        //  - the first letter must be lowercase
        if(!(sifre.charAt(0)>='a' &&sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk olmali");
            flag++;//bir ceza puani aldi
        }
//  - the last character must be a number
        if(!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("son karakter rakam olmali");
            flag++;//
            // - the password must not contain spaces
        } if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        //         - the length must be at least 10 characters*/
       /* if (!(sifre.length() >= 10)) {
            System.out.println("sifeninn uzunlugu 10 karakter olmali");
            flag++;

       // }if(flag==0){
       //     return true;
        }else {
            return false;
        }
        }*/
    }}