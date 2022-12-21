package days.day17_Arrays.Questions;

import java.util.Arrays;

public class Question3_IcArrayToplami {
    public static void main(String[] args) {
        // Question 3- In a given 2 dimensional array,
        // add the elements in each inner array and
        // assign these sums to a single-layer array that we will create.
        //  input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        // output: [10, 3, 12, 10, 9]
        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        int[] sumOfInner = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumOfInner[i] += arr[i][j];

            }

        }
        System.out.println(Arrays.toString(sumOfInner));
 }
}