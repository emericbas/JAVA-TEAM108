package days.day11_forLoop;

public class C06_FizzBuzzQuestion {
    public static void main(String[] args) {
      //  Question 8 (interview)- Get a positive number from user,
        //  print all integers starting from 1,
        //  - If the number is divisible by 3, print fizz instead of number
       // - If the number is divisible by 5, print buzz instead of number
       // - if the number is divisible by both 3 and 5, print fizzBuzz instead of number
int input= 53;
        for (int i = 1; i <=input ; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("fizzBuzz");
            }else if(i%3==0){
                System.out.print("fizz ");
            }else if(i%5==0){
                System.out.print("buzz ");
            }else System.out.print(i +" ");

        }
    }
}
