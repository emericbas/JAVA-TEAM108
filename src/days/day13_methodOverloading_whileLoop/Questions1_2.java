package days.day13_methodOverloading_whileLoop;

public class Questions1_2 {
    public static void main(String[] args) {
      //  Question 1- Print 2-digit positive integers divisible by 7.
        for (int i =10; i <=99 ; i++) {
            if(i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.println("------------------");

     //  Question 2- Find the sum of digits of the number received from the user using the while loop

      int input=12345;
        int sum=0;
        while (input>0) {
            sum += input % 10;
            input/=10;

        }  System.out.println(sum);


        }

    }

