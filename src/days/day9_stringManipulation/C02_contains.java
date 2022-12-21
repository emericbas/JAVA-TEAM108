package days.day9_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        // true ya da false goruruz
        String str="Java ogren, mutlu ol";
        //str mutlu iceriyor mu?
        System.out.println(str.contains("mutlu"));//true
        //charSequence : char dizisi
        System.out.println(str.contains("j"));// false case sensitive
        System.out.println(str.contains(""));//true
         //contains method'u kac tane olduguna degil,
        // sadece var olup olmadigina bakar
        System.out.println(str.contains("Ja" )&& str.contains("mutl"));//true
        System.out.println(str.contains("Ja" )&& str.contains("mutluol"));//false
        String str2="Java";

        // str 'da str2 var mi?
        System.out.println(str.contains(str2));//true

    }
}
