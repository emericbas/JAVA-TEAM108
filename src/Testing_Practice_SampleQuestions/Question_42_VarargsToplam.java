package Testing_Practice_SampleQuestions;

public class Question_42_VarargsToplam {
    public static void main(String[] args) {
     /*   Soru 42-)
        Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını yazdıran bir dönüş methodu (void) yazın
        Method name=sum
        eğer metodu bu şekilde çağırırsanız
       toplam(1,2,3) çıktı =6
        toplam(1,2,3,4,5) çıktı =15
        sum(1,2) output=3
        Ipucu:  varargs sorusu, varargs olusturalım

      */
        varargsToplam(1, 2, 3, 4);
    }

    public static void varargsToplam(int a, int... b) {
        int toplam = a;
        for (int i = 0; i < b.length; i++) {
            toplam += b[i];
        }
        System.out.println(toplam);
    }
}

