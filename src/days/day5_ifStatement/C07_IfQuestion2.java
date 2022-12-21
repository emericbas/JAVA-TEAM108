package days.day5_ifStatement;

import java.util.Scanner;

public class C07_IfQuestion2 {
    public static void main(String[] args) {
       // /ques 2)
        Scanner scan=new Scanner(System.in);
        System.out.println("yazdirmak istedigin ayin ilk harfini girin");
        char ilkHarf=scan.next().charAt(0);
        if(ilkHarf=='o') System.out.println("Ocak");
        if(ilkHarf=='s') System.out.println("subat");
        if(ilkHarf=='m') System.out.println("Mart veya Mayis");
        if(ilkHarf=='n') System.out.println("Nisan");
        if(ilkHarf=='h') System.out.println("Haziran");
        if(ilkHarf=='t') System.out.println("temmuz");
        if(ilkHarf=='a') System.out.println("Agustos veya Aralik");
        if(ilkHarf=='e') System.out.println("Eylul veya Ekim");
        if(ilkHarf=='k') System.out.println("Kasim1820");
    }
}
