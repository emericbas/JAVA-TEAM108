package days.day4_increement_Concatenation;

public class C04_Operators {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        boolean c;
        // ==   EQUALITY
        System.out.println(c=a*15==b*10);//true

        //!==  NOT EQUAL
        System.out.println(!true);//false
        System.out.println(!(a<b));//false
        System.out.println(c=15!=b);//false

        c=10*a!=15*b;
        System.out.println(c);//true

        //&&,&    AND OPERATOR
        c=a>=b&& 3*a<4*b;//f&&t
        System.out.println(c);//f
        //&& ilk false gorunce digerlerine bakmaz,direk false yazar. hizlidir
        //& tum islemi yapar, yavastir


        // OR || OPERATOR
        /* hem 3 hem 5 e bolunebilen bir sayi=
         a%3==0 && a%5==0

         3'e veya 5'e bolunebilen sayilar
         a%3 ==0  || a%5==o

         0'dan buyuk ve 100'den kucuk sayilar
         0<a  && a<100

         0'dan kucuk veya 100'den buyuk sayilar
         a<0 || a>100

         Bir ucgenin uc kenari a,b,c uzunluklarindadir.Bu ucgenin eskenar oldugunu kontrol etmek istersek
         a==b && b==c

         */


    }
}
