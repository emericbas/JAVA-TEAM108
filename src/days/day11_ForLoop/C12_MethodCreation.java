package days.day11_ForLoop;

public class C12_MethodCreation {
    public static void main(String[] args) {
        //verilen sayinin faktoriyelini hesaplayin
        int input = 13;
        int faktoriyel = 1;
        for (int i = input; i >= 1; i--) {
            faktoriyel *= i;
        }
    }


}
