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
        if(!cumle.contains(metin)){
            System.out.println("cumle metni icermiyor");
        }else {
            int ilkindex=cumle.indexOf(metin);
            int ikinciindex=cumle.indexOf(metin,ilkindex+1);
            if(ikinciindex==-1){
                System.out.println( "metni sadece 1 kere iceriyor");
            }
            else{
                System.out.println( "metni birden fazla iceriyor");
            }
        }

    }
}
