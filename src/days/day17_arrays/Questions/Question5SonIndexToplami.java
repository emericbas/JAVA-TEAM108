package days.day17_arrays.Questions;

public class Question5SonIndexToplami {
    public static void main(String[] args) {
       // Question 5- Create a method that prints the sum of the last elements of each inner array in a given 2
      //  dimensional array
        int[][]arr={{1,2,3,4},{4,5,6},{6,7}};
sumOfLastElements(arr);
    }
    public static void sumOfLastElements(int [][]arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            {
                sum+=arr[i][arr[i].length-1];


            }

        }
        System.out.println(sum);
    }
}
