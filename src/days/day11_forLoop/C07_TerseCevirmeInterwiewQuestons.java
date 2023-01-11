package days.day11_forLoop;

public class C07_TerseCevirmeInterwiewQuestons {
    public static void main(String[] args) {
          // Question 9 (interview)- Ask the user for a String and print and save the String in reverse.
        String str= "Java ogrenmek icin cok calismak lazim";
        String terstenStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            terstenStr += str.substring(i,i+1);// save

        }
        System.out.println("Girilen cumlenin tersten yazilisi :"+ terstenStr);

        System.out.println("--------------char ile------------------");
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        }
}
