package days.day12_methodCreation.Questions;

public class Q4 {
    public static void main(String[] args) {
        //  Question 4- Get an integer from the user in the main method.
        //  Create a method that finds the number of positive divisors of the entered number
        //  and returns it to us.
        System.out.println(positiveDivisors(36));

    }

    public static int positiveDivisors(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        } return counter;


        }
    }
