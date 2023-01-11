package days.day17_arrays.Questions;

public class Question1_CiftSayiToplami {
    public static void main(String[] args) {
        //  Question 1- Create a method that adds the even numbers in a given 2 dimensional array and
        //  prints the result.
        int [][] arr={{1,4,7},{5,6,0,8},{7,12,9,3,1}};
        sumOfEvenNumbers(arr);
    }
    public static void sumOfEvenNumbers(int[] []arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0){
                    sum+=arr[i][j];
                }

            }

        }
        System.out.println("Cift sayilarin toplami: "+ sum);
    }
}
