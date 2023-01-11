package days.day18_arrayList.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_gradeOfStudents {
    public static void main(String[] args) {
        //Create method to take all grades  from the teacher ,
        // until teacher enters a number higher than 100 and
        // save them in a list and return it
        System.out.println(gradeList());

    }
    public static List<Integer> gradeList(){
        Scanner scan=new Scanner(System.in);


        List<Integer >gradeList=new ArrayList<>();// a list to save grades
        Integer grade=0;
        while(grade<=100) {
            System.out.println("Please enter students' grades");
            grade = scan.nextInt();
            if (grade <= 100) {
                gradeList.add(grade);

            }
        }

        return gradeList;
    }
}
