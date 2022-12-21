package days.day10StringManipulation;

public class C04_replaceFirst {
    public static void main(String[] args) {
        // eger tum a'lari degil de sadece ilk a'yi degistirmek istersek
        String str="Java heyecandir";
        System.out.println(str.replaceFirst("a","A"));
        // ilk harf veya rakami * yap
        System.out.println(str.replaceFirst("\\w","*"));
    }
}
