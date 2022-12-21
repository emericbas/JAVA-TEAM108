package days.day9_stringManipulation;

public class C09_soru {
    public static void main(String[] args) {
        //KUllanicidan cumle ve metin al
       // 1)Cumle metini icermiyor
       // 2)Cumle metini sadece birkez iceriyor
        //3)Cumle metini 1'den fazla iceriyor  yazdirin
        String cumle="Java cok guzeldir cok.";
        String metin="cok";
                if(!cumle.contains(metin)){
                    System.out.println("Cumle metini icermiyor");
                }else {
                    int ilkIndex=cumle.indexOf(metin);
                    int sonIndex=cumle.lastIndexOf(metin);
                    if (ilkIndex == -1) {
                        System.out.println("Cumle metini sadece birkez iceriyor");  }
                  else System.out.println("Cumle metini 1'den fazla iceriyor");  }

                }
    }

