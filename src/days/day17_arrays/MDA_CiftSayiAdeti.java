package days.day17_arrays;

public class MDA_CiftSayiAdeti {
    public static void main(String[] args) {
        //Verilen iki katli bir int array'deki cift sayi adetini bulan kod yaziniz
int [][]arr={{4,6},{3,5,8},{1,0,4}};
int counter=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0){
                    counter++;
                }

            }
        }
        System.out.println("MDA'deki cit sayi "+counter+" tanedir");

    }
}
