package days.day4_increement_Concatenation;

public class C01_Pre_PostIncreement {
    public static void main(String[] args) {
      int  number=10;
        System.out.println(number++);//10
        //Java iki islem varsa siralama yapar.
        //eger ++ variable dan sonra ise artirma islemi sonra yapar
        //burada once yazirma sonra artirma yapar

        System.out.println(number);//11

        System.out.println(++number);//12
        //++ variable dan once ise artirma islemini once yapar.
        //Bu durumda java once artirma sonra yazdirma islemi yapar
        System.out.println(number);//12
    }
}
