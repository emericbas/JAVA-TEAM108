package days.day10StringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java ogren, adana ye :)";
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("Java", "yazilim"));
         String telefon="555 34512378";
        System.out.println(telefon.replace("555","590"));
        System.out.println(telefon.replace('3','9'));

        // trim bas ve sondaki spaceleri siler
    }
}
