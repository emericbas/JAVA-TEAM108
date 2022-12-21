package days.day13_methodOverloading_whileLoop;

public class Question3 {
    public static void main(String[] args) {
      //  Question 3- Create a method that reverses a given String using the while loop
        //  and returns this state to us.
        System.out.println(reverse("Yeter demek icin erken mi dostlar!!!"));
    }
    public static String reverse(String str){
        String reverseStr="";
      int i= str.length()-1;
        while(i>=0){
            reverseStr+=str.charAt(i);
            i--;


        }return reverseStr;
    }
}
