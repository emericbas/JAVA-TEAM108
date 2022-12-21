package Testing_Practice_SampleQuestions;

public class Question_24_ciftSayi {
    public static void main(String[] args) {
      //  20'den 0'a kadar çift sayıları yazdırın
        //  ancak decrement (i--) kullanmayın.

     //  Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir *
        int number=20;
        for (int i = 20; i >=0 ; i--) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }


    }
}
