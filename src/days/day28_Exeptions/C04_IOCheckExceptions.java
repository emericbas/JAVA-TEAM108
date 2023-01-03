package days.day28_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_IOCheckExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("src/days/day28_Exeptions/metin.txt");
        /*
        Bazi kodlari yazdigimizda java compile time sirasinda  o kodlarda exeption riskini gorur ve bizden bir cozum bekler

        Ozellikle dosya okuma ve yazma ile ilogili IO(INPUT/OUTPUT) islemlerinde java'ya okuyamazsam , ya yazamazsam diyerek bizden compile time'da cozum isyer

        bu durumda biz exception ile karsilasildiginda
             kod dursun diyorsak : method satirina throws keyword kullanarak
                                  beklenilen exception(lar)i deklare edebiliriz
                                  Bu sadece olayin farkinda oldugumuzu deklare eder
                                  exception firlatmanin ve kodu durdurmanin onune gecmez
            kod calismaya devam etsin : try-catch-(finally) blogu kullanabiliriz
         */

    }
}
