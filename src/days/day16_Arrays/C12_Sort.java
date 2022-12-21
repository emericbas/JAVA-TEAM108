package days.day16_Arrays;

import java.util.Arrays;

public class C12_Sort {
    public static void main(String[] args) {
        //verilen bir int  Array'de en kucuk ve en buyuk sayilari yazdiran bir method olusturun

        int[]arr={3,8,1,5,2,9};
enBuyukEnKucukElementYazdir(arr);
}public static void enBuyukEnKucukElementYazdir(int[]arr){
        Arrays.sort(arr);//siraladik
        System.out.println("en buyuk elemen = "+arr[arr.length-1]);//9 son index
        System.out.println("en kucuk element ="+arr[0]);//1  ilk index


    }

}
