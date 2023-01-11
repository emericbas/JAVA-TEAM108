package days.day11_forLoop;

public class C09_NestedLoop {
    public static void main(String[] args) {
        // input olarak verilen kenar uzunluklarina gore
        // asagidaki sekli cizdirin

        int kisaKenar=5;
        int uzunKenar=8;
      /*  output=

       * * * * * * * * // bir satiri nasil yazdiracagimizi inner loop ile belirleriz
       * * * * * * * *
       * * * * * * * *
       * * * * * * * *
       * * * * * * * *
       Satirda yaptigimiz islemi kac kere tekrar edecegimizi ise outer loop belieliyor
       */

        for (int i = 1; i <=kisaKenar ; i++) {
            for (int j = 1; j <=8 ; j++) {
                System.out.print("* ");
            }
            System.out.println(""); //satirla ile islemimiz bittiginde alt satira gecmesi icin
        }
    }
}
