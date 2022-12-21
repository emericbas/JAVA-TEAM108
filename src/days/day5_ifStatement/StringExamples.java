package days.day5_ifStatement;

public class StringExamples {
    public static void main(String[] args) {
        String strValue="123test";
        System.out.println(strValue);

        String searchResult = "1-48 of 65 results for";
       System.out.println("\n 1-48 of 65 results for \n");

        String number1str="1";
        System.out.println(number1str );
        int num1 = 1;
        System.out.println(num1 );
        System.out.println(num1+ num1 );//numeric+numeric=numeric
        System.out.println(number1str+ num1 );//string+numeric=string




       int value1=10;
        int value2=20;
       // Result of sum=30
        System.out.println("Result of sum= " +value1+value2);//String concatenation
        System.out.println("Result of sum= " +(value1+value2));



        boolean bValue=true;
       System.out.println("TEST"      +bValue);
       System.out.println("TEST"   +   "Value");
        System.out.println(value1 +value2);

        char num1char=1;
        System.out.println(num1char);
        byte num1byte=1;
        System.out.println(num1byte);

        String test;
        //test=1;//ERROR!!
        test="1"+1+2;  //con-->string 112
        System.out.println("test=" +test);

        int number ;
        number =1+1+3;
        System.out.println("number=" +number);



    }
}
