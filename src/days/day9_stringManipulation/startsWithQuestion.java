package days.day9_stringManipulation;

import org.w3c.dom.ls.LSOutput;

public class startsWithQuestion {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir metin alin
        //cumlenin o metni icermesine gore asagidakilerden uygun olani yazdirin
        //1)cumle metni icermiyor
        //2)cumle metni sadece 1 kere iceriyor
        //3)cumle metni birden fazla iceriyor
        String cumle="Java cok guzeldir cok.";
        String metin="cok";
        int ilkIndex =cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);
        if(!cumle.contains(metin)){
            System.out.println("Cumle metini icermiyor");
        }else if(ilkIndex==sonIndex) {
            System.out.println("Cumle metini sadece birkez iceriyor");
        }else System.out.println("Cumle metini 1'den fazla iceriyor");
            }
        }



