package Testing_Practice_SampleQuestions;

public class Question_26_mukemmelSayi {
    public static void main(String[] args) {
        // Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        // NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
        int number = 6;
        int sum = 0;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                sum += i;
       }

            } if (sum == number) {
            System.out.println("mukemmel sayi");

        } else {
            System.out.println("mukemmel degil");
    }
    }
    }