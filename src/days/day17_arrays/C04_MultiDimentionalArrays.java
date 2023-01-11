package days.day17_arrays;

import java.util.Arrays;

public class C04_MultiDimentionalArrays {
    public static void main(String[] args) {
        int[][]arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//4
        System.out.println(arr[2][1]);//7
        System.out.println(arr[3]);//[I@65ab7765 referans degeri  bu sekilde array yazilmaz
        //Multideminsional array ile calisirken dikkat etmemiz gereken en onemli konu
        // yazdigimiz kodun bir array mi yoksa yoksa yazdiracagimiz bir element mi dondurdugudur
        System.out.println(Arrays.toString(arr[3]));//[2]

        //21.satirdaki 2 elementini yazdirmak istersek
        System.out.println(arr[3][0]);//2
        //TUM ARRAY'I YAZDIRMAK ICIN  (deepToString(arr))
        System.out.println(Arrays.toString(arr));//icindekileri yazdiramaz//[[I@1b28cdfa, [I@eed1f14, [I@7229724f, [I@65ab7765, [I@4c873330]

        System.out.println(Arrays.deepToString(arr));//butun array'i yazdirir//[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]
    }
}
