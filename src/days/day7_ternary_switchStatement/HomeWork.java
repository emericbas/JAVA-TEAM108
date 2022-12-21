package days.day7_ternary_switchStatement;

public class HomeWork {
    public static void main(String[] args) {
        // TASK 3
       // int pies = 10, people = 4;
       // double piesPerson;
       // piesPerson = pies/ (double)people;
        //10/4=2.5
       // System.out.println("piesPerson = " + piesPerson);
        
        // TASK 4
        int pies =10, people=4;
       double piesPerson;
        piesPerson =( double)(pies/people);// 2.0
       System.out.println("piesPerson = " + piesPerson);

        //1- (int)(7.9)  + (int)(6.7)= 7+6=13 Explicity
        //2- (int)(7.9+6.7)=14 Explicity
        //3-(double)(17)= 17.0 Implicity
      //  4-(double)(8+3)=11.0 Implicity
       // 5-(double)(7)/2= 3.5 Implicity
        System.out.println((double)(7/2)); // 3.0 Implicty
        System.out.println((int)(7.8+(double)(15)/2));// 15 Explicity
        System.out.println((double)(15)/2);// 7.5 Implicity


    }
}
