package days.day17_arrays;

public class MDAenUzunStringBulma {
    public static void main(String[] args) {
        //MDA,daki en uzun String'i bulan bir kod yaziniz..
       String [][]arr={{"ilker","nesrin"},{"hasan","heysem","adem","yusuf enes"}};
       String enUzunKelime=arr[0][0];
       String enKisaKelime=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               if (arr[i][j].length()>enUzunKelime.length()){
                enUzunKelime=   arr[i][j];
               }if(arr[i][j].length()<enKisaKelime.length()){
                  enKisaKelime =arr[i][j];
                }

            }

        }
        System.out.println("enUzunKelime = " + enUzunKelime);
        System.out.println("enKisaKelime = " + enKisaKelime);

}
}
