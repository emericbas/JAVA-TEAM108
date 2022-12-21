package days.day17_Arrays.Questions;

import java.util.Arrays;

public class innerElementlerCarpimiBenYazdimSoruyu {
    public static void main(String[] args) {
        //MDA'da inner elementlerin carpimini,olusturdugunuz yeni array'e yazdirin
        // input=int[][] arr = {{2, 3, 2}, {1, 1, 4, 5},{1,2,-3}}
        //output=[12, 20, -6]

        int[][] arr = {{2, 3, 2}, {1, 1, 4, 5},{1,2,-3}};
        int[] son = new int[arr.length];
        for (int k = 0; k < son.length; k++) {
            son[k]=1;

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                son[i] *= arr[i][j];

            }
        }

            System.out.println(Arrays.toString(son));
        }


}