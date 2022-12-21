package days.day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {
        int s=20;
        System.out.println(s);
        //int sayi=30;  Bir scope'ta tanimlanan variable'in yeniden tanimlanma imkani yoktur.
     //   String sayi="Emine";  Data turunun de degistirerek yeniden tanimlamasimumkun degildir.
        //   Cunku kullanirken variable'in ismini yazdigimizda hangi sayi vaeriable'ini kullanacagi belli olmaz

    }
    public static void method1(){
        method2(5);
        String s="Emine";
        System.out.println(s.toLowerCase());//emine

    }
    public static void method2(int s){
        s=s*s;
        System.out.println(s);
    }
}
