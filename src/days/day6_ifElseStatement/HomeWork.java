package days.day6_ifElseStatement;

public class HomeWork {
    public static void main(String[] args) {
        //TASK 1
        //Calculates the average of three numbers
        int a = 12;
        int b = 48;
        int c = 96;
        System.out.println("Average of ( a,b,c) = " + (a +b +c)/3);

        //TASK 2
        //The area and perimeter of a circle that has a radius of 5.5 using the following the formulas
        //perimeter = 2*radius* PI
        //area = radius* radius*PI
        double r =5.5;
        System.out.println("perimeter = " + 2*r*( Math.PI));
        System.out.println("area = " + r*r*(Math.PI));

        //TASK 3
        //It converts mile to km
        double miles = 10.5;
        double kilometers = miles * 1.6;
        System.out.println("10.5 miles= " + miles *1.6 +" km");

        // TASK 4
        //It converts Fahrenheit to Celcius
        // C = (F-32)*5/9
        double Fahrenheit = 21.4;
        System.out.println("21.4 Fahrenheit = " +(( Fahrenheit- 32)* 5/ 9) +" Celcius");

        // TASK 5
        //It will print a sum of the two numbers. Use variales to store  num1, num2, and sum
        int num1 = 27;
        int num2= 39;
        System.out.println("sum = " +( num1 + num2));
    }
}
