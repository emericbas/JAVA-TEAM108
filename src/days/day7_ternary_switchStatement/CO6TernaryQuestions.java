package days.day7_ternary_switchStatement;

public class CO6TernaryQuestions {
    public static void main(String[] args) {
        /*
        Question 1- Ask the user for a number, check the number and print “this number is a multiple of 5”
        if it is divisible by 5.
        Question 2- Get 3 side lengths of triangle from the user, print “Equilateral triangle” if the triangle is
        equilateral, otherwise print “Not equilateral”.
        Question 3- Ask the user for a letter, if the entered character is lowercase, print it in uppercase,
                otherwise print the entered letter
        Question 4- Get a grade from the user, print “Passed the Class” if it is 50 or more, and “Sorry,
                Failed” if it is less than 50.
        Question 5- Get two numbers from the user and print the smaller number
        Question 6- Get a number from the user and print its absolute value// mutlak deger

         */
        //QUESTION 4
         int input=54;
        System.out.println(input>=50 ?"Passed the class" : "sorry failed");

        // question 3
        char character= 'n';
        System.out.println(character>='a' && character<='z'  ?(char)(character-32): character);

        // question 6
         input=-75;
        System.out.println(input>0 ?input:(-1)* input);


    }
}

