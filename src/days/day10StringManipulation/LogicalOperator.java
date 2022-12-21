package days.day10StringManipulation;

public class LogicalOperator {
    public static void main(String[] args) {
       //   && AND OPERATOR= If all conditions are true,the result will be true
        // if  one of condition is false,the result will be false
        System.out.println(3>2 && 5>3);
        System.out.println(3>=2 && 5<=3);
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
      //  System.out.println(12 && 15);
        int c=10;
        boolean first= 20>10;
        boolean second= 20>=c;
        System.out.println(first&&second);

        //& hepsine tek tek bakar,sonra karar verir true or false
        //&& ilk false bulunca digerlerini check yapmaz.Ikisi de ayni gorevi yapar
         int a=20;
      //  System.out.println(20>3&& a>10);//true
      //  System.out.println(20<3&& ++a>10);//
      //  System.out.println("a = " + a);
        System.out.println(20<3&& ++a>10);// BURADA A YI 1 ARTIRMADI CUNKU ILKI FALSE DU
        System.out.println(20<3& ++a>10);// BURADA A YI 1 ARTIRDI CUNKU ILKI FALSE OLSA DA HEPSINE BAKMASI GEREKIYOR
        System.out.println("a = " + a);

        //     || OR OPERATOR= IF all conditions are false, the result will be false. If one of the conditions is true, the result will be true.
        System.out.println(3>1||3>2);
        System.out.println(3>1||3<=2||2>0);
        
         int m=10;
        System.out.println(3>1||++m>2);// m yi artirmaz birinci kisim true oldugu icin
        System.out.println("m = " + m);
        System.out.println(3>11||++m>2);
        System.out.println("m = " + m);//m yi artirir .1. kisim false 2. kisma da bakar
//to find the weekends
       
        boolean isWeekend;
        boolean isSunday=false;
        boolean isSaturday=false;
        isWeekend= isSunday||isSaturday;
        System.out.println("isWeekend = " + isWeekend);


     //   number is bigger than 9 and number is smaller than 100, let say it two digits

        int mh=145;
        boolean twoDigits= mh>9&& mh<100;
        System.out.println("twoDigits = " + twoDigits);
        


        // number is between 20 40    60 80
int num =78;
boolean choose=(20<num&& num<40)||(60<num && num<80);
        System.out.println("choose = " + choose);
      
        
        //FIND WheTHER THE NUMBER IS EVEN OR NOT

       num=24;
        boolean isEven=num%2==0; //num%2 !=1 SAME
        System.out.println("isEven = " + isEven);



        //! NOT OPERATOR
        boolean not=true;
        System.out.println("not = " +! not);
        System.out.println(!false);

         a=20;
       // System.out.println(!a==20);error
       // System.out.println(!(a==20));//boolean isOddNum=!isEven;
       // System.out.println("isOddNum = " + isOddNum);


       //  isWeekend;
      //  boolean isSunday = true;
      //  boolean isSaturday= true;
      //  isWeekend=isSunday|| isSaturday;
      //  boolean isWeekdays=!isWeekend;
      //  System.out.println("isWeekdays = " + isWeekdays);








        //  ||  OR
        //

    }
}
