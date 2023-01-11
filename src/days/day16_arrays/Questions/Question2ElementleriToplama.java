package days.day16_arrays.Questions;

public class Question2ElementleriToplama {
    public static void main(String[] args) {
        //  Question 2- Write a method that adds the positive integers in a given array and
        //  returns the result to us.
        int[]arr={3,-3,5,-7,-6,1,-2};

        System.out.println(pozitifToplam(arr));

    }public static int pozitifToplam(int[]arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0){
                toplam+=arr[i];
            }

        }return toplam;
    }

    }

