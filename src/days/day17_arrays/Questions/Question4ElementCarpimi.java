package days.day17_arrays.Questions;

public class Question4ElementCarpimi {
    public static void main(String[] args) {
       // Question 4- Create a method that returns the product of all numbers in a given 2 dimensional array.
        int [][]arr={{2,3,2},{1,1,4,5}};
        System.out.println(product(arr));
    }
    public static int product(int [][]arr){
        int carpim=1;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               carpim*=arr[i][j];

            }

        }return carpim;
    }
}
