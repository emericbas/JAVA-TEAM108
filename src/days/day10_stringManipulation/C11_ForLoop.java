package days.day10_stringManipulation;

public class C11_ForLoop {
    public static void main(String[] args) {
        //verilen sayinin faktoriyelini hesaplayin
        int input=13;
        int faktoriyel=1;
        for (int i = input; i >=1; i--) {
            faktoriyel*=i;

        }
        System.out.println("verilen "+input +" sayinin faktoriyeli :"+ faktoriyel);
    }
}
