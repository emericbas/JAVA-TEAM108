package days.day9_stringManipulation;

import java.util.Locale;

public class C08_lastIndexOf {
    public static void main(String[] args) {
     String str="Java hafiften beyin yakiyor";
     //index hep bastan baslar
        System.out.println(str.lastIndexOf("h"));//5
        System.out.println(str.lastIndexOf("java"));//-1
        System.out.println(str.lastIndexOf("Java"));//0
    }
}
