package days.day9_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        // BITER MI?
        String str = "Java ogrenen issiz kalmaz";
        System.out.println(str.endsWith("kalmaz"));//true
        System.out.println(str.endsWith("Java ogrenen issiz kalmaz"));//true
        System.out.println(str.endsWith(""));//true
        System.out.println("======================================");


        //SORU;Kullanicidan bir mail alin
        //1) @ icermiyorsa "gecersiz mail"
        //2) @gmail.com icermiyorsa " gmail olmali"
        // 3) @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mailinizi giriniz");
        String mail = scan.nextLine();
        if (!mail.contains("@")) {
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi var");
        } else System.out.println("basarili");
    }
}



