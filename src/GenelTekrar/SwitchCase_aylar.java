package GenelTekrar;

import java.util.Scanner;

public class SwitchCase_aylar {
    public static void main(String[] args) {
//girilen ay numarasina gore ,ayin kac gun oldugunu yazdiriniz
        //31 ceken aylar=ocak,mart,mayis,temmuz,agustos,ekim,aralik
                        //    1   3   5         7    8            10  12
        //30 ceken aylar= nisan, haziran,eylul ,kasim
                        //    4       6       9   11
        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int ayNo=scan.nextInt();

        switch(ayNo){
            case 1,3,5,7,8,10,12:{
                System.out.println("ay 31 cekiyor");
                break;  }
            case 4,6,9,11:{
                System.out.println("ay 30 cekiyor");
                break; }
            case 2:{
                System.out.println("Yil giriniz");
                int yil=scan.nextInt();
                if(yil%4==0){
                    System.out.println("ay 29 cekiyor");
                }else System.out.println("ay 28 cekiyor");
          break;  }
            default : {
                System.out.println("gecerli sayi giriniz");

            }}

        }
    }
