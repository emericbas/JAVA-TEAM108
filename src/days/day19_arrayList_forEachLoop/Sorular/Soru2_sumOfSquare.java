package days.day19_arrayList_forEachLoop.Sorular;

public class Soru2_sumOfSquare {
    public static void main(String[] args) {
      //  Question 2- Create a method that takes the squares of each element in the given int array and
        //  prints the sum of its squares
        int[]arr={3,-8,0,5,1};
        square(arr);
    }
    public static void square(int arr[]){
        int sum=0;
        for (int each:arr
             ) {
          sum+=each*each;
        }

        System.out.println(sum);

    }
}
