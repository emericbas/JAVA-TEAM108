package days.day23_dateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {
        //verilen iki sayiyi toplayip yzdiran bir method olusturun

        topla(5,8);//13

        topla(5,7,8);//20
        topla(4,6,7,8);//25
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {System.out.println("4 sayinin toplami: "+(sayi1 + sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {System.out.println("3 sayinin toplami: "+(sayi1 + sayi2+sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("2 sayinin toplami: "+(sayi1 + sayi2));
    }

}

