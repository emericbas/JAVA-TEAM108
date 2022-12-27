package Testing_Practice_SampleQuestions;

public class Question_40_ArraydeToplam {
    public static void main(String[] args) {
     /*   Soru-40)
        Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren bir method yazın ve ardından sonucu main methodda yazdırın.
        Örn:
        girdi : {1,2,3,4,5,6,7,8}
        çıkış: 36
        ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün

      */
        int []arr= {1,2,3,4,5,6,7,8};
        int toplam=0;
        System.out.println(arraydeToplam(arr,toplam));
    }
    public static int arraydeToplam(int[]arr,int toplam){

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
        }return toplam;
    }
}
