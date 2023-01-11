package days.day27_overriding;

public class GExeptions {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
    //    System.out.println("Iki sayinin bolumu : " + a / b);
        // Bolen sayinin 0 olmasi ,bukodda ongorulebilecek bir risktir .
        // Ve kodumuzu yazarken bu riski cozebilecek sekilde kodumuzu yazabiliriz

        if (b != 0) {
            System.out.println("Iki sayinin bolumu : " + a / b);
        } else {
            System.out.println("Bolenecek sayi 0 olamaz");
        }
    }
}