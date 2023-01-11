package days.day12_methodCreation.Questions;

public class Q3 {
    public static void main(String[] args) {
        // Question 3- Get a positive integer from user in main method.
        //Create a method that checks
        //  if the entered number is a prime number and returns "prime" or "not prime" as a result.

        int input = 33;
        System.out.println(asalMi(33));
    }

    public static boolean asalMi(int input) {
        boolean asalMi = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                asalMi = false;
                break;
            }

        }
        return asalMi;

    }
}
