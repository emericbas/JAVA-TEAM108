package days.day18_arrayList.Questions;

import java.util.ArrayList;
import java.util.List;

public class QuestionAvarage {
    public static void main(String[] args) {
        // Create a method that calcullates the avarage value of given values,
        // than print all values which are over avarage value
      double[] numbers={33.0,45.0,43.0,12.0,56.0,5.0};
      overAvarage(numbers);
    }

    public static void overAvarage(double[] number) {
        List<Double> OverNumbers = new ArrayList<>();
        double sum = 0;
        for (Double each : number) {
            sum += each;
            double avarage = sum / number.length;
            if (each > avarage) {
                OverNumbers.add(each);

            }

        }
        System.out.println(OverNumbers);
    }
}