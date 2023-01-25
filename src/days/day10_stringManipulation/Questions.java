package days.day10_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        // Question 1 : Get a sentence from the user
        // - if the sentence includes home, print "home home sweet home"
        //        - if the sentence includes work, "good to work"
        //       - if it includes both "You have home and work"
        //      - if it contains neither, print "you need to work hard"
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        if (sentence.contains("home ") && sentence.contains("work")) {
            System.out.println("you have home and work");
        } else if (sentence.contains("work")) {
            System.out.println("Good to work");
        } else if (sentence.contains("home")) {
            System.out.println("Home home sweet home");
        } else System.out.println("you need to work");
        System.out.println("---------------------------------");

        //  Question 5 : Get the user's first and last name separately.
        //          - if the name is longer, print the first letters of the name and surname as capitals and the rest
        //  should be lowercase
        //          - if the surname is longer, print the first letter of the name as capital and the rest of the name
        //  should be lowercase. And all of surname letters should be in capitals
        String name = "gUL";
        String surname = "bASAr";
        if (name.length() > surname.length()) {
            System.out.println(name.substring(0, 1).toUpperCase(Locale.ROOT)+name.substring(1).toLowerCase()+"  "+
                    surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase());
        } else if (surname.length() > name.length()) {

            System.out.println(name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+" "+
                    surname.toUpperCase());
        }
        //          - Question 6: Take a String from the user, if the length of the String is even, add :) to the middle, if
        //  the length of the String is odd, delete the middle letter and replace it with :
          /*  Question 2: Collect and print the String prices given by the user in a certain format.
        input1: “15.30 €” , input2: “11.40 €”
        output : 26.70 €
        Question 3: Write a program that deletes unwanted numbers and special characters in the text
        received from the user and converts only the first letter to uppercase and the other letters
        to lowercase.
        input : java1 ogRe2@nMek3 #ne +Gu=zel
        output : Nice to learn Java.
        String Manipulations / Methods to Use
        */
        System.out.println("--------------------------------------");
       // Question 4 : Ask the user for a password, check the following terms and tell the user any missing
       // terms that need to be corrected, if it satisfies all conditions, print "password saved successfully"
       //         - the first letter must be lowercase
       //         - the last character must be a number
       // - the password must not contain spaces
       //         - the length must be at least 10 characters*/
        String password="handmade123456";
        boolean allOk=false;
        if(!(password.charAt(0)>='a'&& password.charAt(0)<='z' )) {
            System.out.println("the first letter must be lowercase");
            allOk=false;
        } if(!(password.charAt(password.length()-1)>='0'&& password.charAt(password.length()-1)<='9')){
            System.out.println("!last character must be a number");
            allOk=false;
        }if(password.contains(" ") ){
            System.out.println("must not space");
            allOk=false;
        }if(!(password.length()>=10)){
            System.out.println("must be at least 10 character");
            allOk=false;
        }if(allOk) {
            System.out.println("password saved succsfully");
        }


}}  // - Question 6: Take a String from the user,
// if the length of the String is even, add :) to the middle,
// if the length of the String is odd, delete the middle letter and replace it with :String ="kol";



          /*  Question 2: Collect and print the String prices given by the user in a certain format.
        input1: “15.30 €” , input2: “11.40 €”
        output : 36.70 €

           */
// Question 3: Write a program that deletes unwanted numbers and special characters in the text
// received from the user and converts only the first letter to uppercase and the other letters
// to lowercase.
// ("[^a-zA-Z0-9\\s]", "")// harf,sayi ve space disindakileri sil
//  String input = "java1 ogRe2@nMek3 #ne +Gu=zel";
// output : Java ogrenmek ne guzel.


