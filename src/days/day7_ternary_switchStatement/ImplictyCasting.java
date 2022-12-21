package days.day7_ternary_switchStatement;

public class ImplictyCasting {
    public static void main(String[] args) {
        int number =10;//NO CASTING
        double rate = number;//asssigning int to double//implicitly casting, Widening.it will be handled by JAVA
        System.out.println("number = " + number);
        System.out.println("rate = " + rate);


        byte hours = 24;//-128 127 no explicitly casting because value is between byte values
        int intNumber = hours;

       // hours =130; // need to be EXPLICITY casting why?Value is out of byte values!!!!
      //  short sValue = 10000;//short  int but no need to be expilicity
        //numByte = 1;
        //numByte = numInt;//we are not looking value in first place,just compare data type!!

        int num=1234; // no casting
        byte bnum2 =121;//121 is inside byte range so no need extra casting
       // byte num2=num2;// need casting implicity
        long lnumber=1234;//imp casting aouto
        long lnumber2=1234890988999L;//no casting
      //  int num3 = lnumber1; need exp casting
      //  int num3 = lnumber2; need exp casting


    }
}
