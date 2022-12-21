package days.day9_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {
        // baslar mi?
        String str="Java mutluluktur";
        System.out.println(str.startsWith("Ja"));//true
        System.out.println(str.startsWith("Java mutluluktur"));//true
        System.out.println(str.startsWith(""));//true
        System.out.println(str.startsWith("mutlu"));//false

        // 5. index'ten sonrasi mutlu ile baslar mi?
        System.out.println(str.startsWith("mutlu",5));// true

        System.out.println(str.startsWith("va",3));// false offset=otelemek
        System.out.println("++++++++++++++++++++++++++++++++++++++");


    }
}
