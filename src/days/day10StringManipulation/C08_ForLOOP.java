package days.day10StringManipulation;

import java.awt.event.MouseAdapter;

public class C08_ForLOOP {
    public static void main(String[] args) {
        //1 ile 50 arasindaki sayilari(dahil sayilar) yanyana yazdirin yazdirma islemi bittiginde
       // tum bu sayilarin toplami =
        int sayilarinToplami=0;
        for (int i = 1; i <=50 ; i++) {
            System.out.print(i + " ");
           // sayilarinToplami=sayilarinToplami+ i;
            sayilarinToplami +=i;// profesyonel
        }
        System.out.println("");
        System.out.println("tum sayilarin toplami ="+ sayilarinToplami);
        }
    }

