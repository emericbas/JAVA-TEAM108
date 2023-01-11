package days.day4_increement_Concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String str1="";
        String str2=" ";
        String str3="_";
        System.out.println(a+b);//30
        System.out.println(str1+a+b);//"10"+20==>"1020"==>1020
        System.out.println(a+str2+b);//"10 " +20==>"10 20"==>10 20
        System.out.println(a+b+str3);//10+20+"_"==>30+"_"==>30_
        System.out.println(str1+a*b);//""+200==>"200"==>200
        System.out.println(str2+(a+b));//" "+30==>" 30"==> 30/
        //+ disinda hic bir islem String ile kullanilmaz
// 10+20 are called operans
        System.out.println(100 +"200"); //100200 int +String=String
        System.out.println("Hello " + "emine");
        //string+boolean=
        System.out.println("Hello " +100*2+5);//Hello +200+5//Hello 2005
        System.out.println('a' +'b');//97+98=195
        System.out.println('a' +'b' +" "+'a'+'b');
        //97+98+""+'a'+'b'
        //195 ab
        System.out.println("100" +'a' +200+300);
//"100a"+200
        //"100a200"+300
        //100a2003000
        System.out.println(" 100" +'a'+200+30*20);

    }
}
