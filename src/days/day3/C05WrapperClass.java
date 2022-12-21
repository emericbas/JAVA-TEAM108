package days.day3;

public class C05WrapperClass {
    public static void main(String[] args) {
        int number=10;
        String str="Java candir";
        /*int primitive oldugundan hazir metodlari yoktur.string ise non-primitive oldugu icin hazir metodlara sahiptir.

        int,char,boolean gibi primitive data turlerinde hazir method kullanmak icin
        Java Integer, Character, Boolean gii wrapper class lar olusturmus

         */
         Integer num2=20;
         /*
         Islemlerimizi yaparken bazen String olarak tanimlanmis ancak matematiksel icerik barindiran variable'lar ile karsilasabiliriz.
         Bu durumda bu turString variable lari  sayiya cevirmek ihtiyacimiz olabilir;
         Eger sayiya cevirmek istedigimiz metinlerde harf veya sayi olmayan baska karakter varsa Java hata verir.
          */
         String str2="123";
         String str3="354";
         int str2Int=Integer.parseInt(str2);//123
        int str3Int=Integer.parseInt(str3);//354
        System.out.println(str2Int+str3Int);//477
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-214748348

        char char1='$';
        System.out.println(Character.isDigit(char1));//false
        System.out.println(Character.isLetter(char1));//false

        short num3=4;
        int num5=num3;
        //Wrapper classlarda casting olmaz
        Short num6=45;
      //  Integer num7=(Integer)num6; casting olmaz error verir

    }
}
