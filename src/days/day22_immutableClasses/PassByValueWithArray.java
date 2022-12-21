package days.day22_immutableClasses;

import java.util.Arrays;

public class PassByValueWithArray {
    public static void main(String[] args) {
        //Create amethod inside of the method ,
        // create an array longer than original one
        // for the longer array, all elements should be 5
        // assign this longer array to the original array and
        // return it
        int[]arr={3,4,5};
        System.out.println(Arrays.toString(fiveArray(arr)));//[5, 5, 5, 5, 5, 5]
    }
    public static int[]fiveArray(int[]arr){
        int []newArr=new int[arr.length+3];
        for (int i = 0; i <newArr.length ; i++) {
            newArr[i]=5;

        }
        arr=newArr;
        return arr;
    }
}
