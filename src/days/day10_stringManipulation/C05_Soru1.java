package days.day10_stringManipulation;

import java.util.Locale;

public class C05_Soru1 {
    public static void main(String[] args) {
        // Question 1 : Get a sentence from the user
        // - if the sentence includes home, print "home home sweet home"
        //  - if the sentence includes work, "good to work"
        //  - if it includes both "You have home and work"
        //   - if it contains neither, print "you need to work hard"
       String str="Evden calisiyorum, ise gitmeye gerek yok";
       String calisilacakStr=str.toLowerCase(Locale.ROOT);
       if(calisilacakStr.contains("home") && calisilacakStr.contains("work")){
           System.out.println("You have home and work");
       }else if(calisilacakStr.contains("home")){
           System.out.println("home home sweet home");
       } else if (calisilacakStr.contains("work")) {

           System.out.println("good to work");
       }else System.out.println("you need to work hard");

    }
}
