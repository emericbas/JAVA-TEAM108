package days.day12_methodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {
        //Verilen bir stringin Palindrome olup olmadigini yazdirin//P
        //Palindrome==duz ve ters okunusu birbirine esittir

        String str="Bu methodlar ne guzelmis";
        String tersStr=C07_TerseCevirme.metniTerseCevir(str);
        if (str.equals(tersStr)){
            System.out.println("palindrome");
        }else{
            System.out.println("palindrome ");
        }
    }
}
