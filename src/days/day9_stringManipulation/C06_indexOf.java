package days.day9_stringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        //GUZEL SORU

        //kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdir
        //cumlede cok kelimesi gecmiyorsa "cok ile baslayan kelime yok" yazdir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle yazin");
        String girilenCumle=scan.nextLine();

        //Sinavlarimizda cokdan secmeli sorular kullaniyoruz
        //javayi cok seviyoruz
        //bu kadar coklu secenek olur mu?

            if(!girilenCumle.contains("cok")) {
            System.out.println("cok ile baslayan kelime yok");
        }else{
                int cokIndexi=girilenCumle.indexOf("cok");
                int boslukIndexi=girilenCumle.indexOf(" ",cokIndexi+1);
            System.out.println(girilenCumle.substring(cokIndexi,boslukIndexi));
        }


    }
}
