package days.day16_Arrays.Questions;

public class CodingBat_DoubleSayiBulma {
    public static void main(String[] args) {

        //    Given an int array, return true if the array contains 2 twice, or 3 twice
        // double23([2, 2,5,6]) → true
        //  double23([3, 3,78]) → true
        //  double23([2, 3,9,8]) → false
        int[] arr = {6, 5, 7, 2, 3};
        int counter1 = 0;
        int counter2 = 0;
        for (int each : arr
        ) {
            if (each == 2) {
                counter1++;
            }
            if (each == 3) {
                counter2++;
            }
        }
        if (counter1 == 2 || counter2 == 2) {
            System.out.println("true");

        } else {
            System.out.println("false");

        }
    }
}