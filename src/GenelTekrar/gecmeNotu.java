package GenelTekrar;

public class gecmeNotu {
    public static void main(String[] args) {
        //vize1,vize2 ve final notlarini alip,
        // vize ortalamasinin %30'u ,
        // final ortalamasinin %70 'i olarak gecme notunuu hesapla
        double vize1=100;
        double vize2=100;
        double finalNot=40;
       double gecmeNotu=(vize1+vize2)/2*0.3+finalNot*0.7;
        System.out.println(gecmeNotu);
    }
}
