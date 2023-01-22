package GenelTekrar;

public class doubleOlusturmaSorusu {
    public static void main(String[] args) {
        // 45 degerinde bir double olusturun. Eger double 5'e bolununce kalan 0 ise ve
        // double 8'e bolununce kalan 0 ise
        // "5 ve 8 ' bolunebilir" yazdirin.
        // Eger double 10'a bolununce kalan 5 ise ve
        // double 9'a bolununce kalan 0 ise
        // "9'a bolunuyor,10'a bolumunden kalan 5 yazdirin"
        double number=45;
        if(number%5==0 && number%8==0){
            System.out.println("5 ve 8 ' bolunebilir" );
        } else if (number%10==5 && number%9==0) {
            System.out.println("9'a bolunuyor,10'a bolumunden kalan 5 yazdirin");

        }
    }
}
