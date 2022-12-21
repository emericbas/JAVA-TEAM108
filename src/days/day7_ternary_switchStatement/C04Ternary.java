package days.day7_ternary_switchStatement;

public class C04Ternary {
    public static void main(String[] args) {
        // Kullanicidan alinan deger
        //100' den buyukse sayiyi  2 ile carpin
        // 100' esit veya  kucukse sayiya 10 ekleyin

        int input= 45;
        //if else ile
        if(input>100) {
            input *= 2;
        } else {input+=10;}
        System.out.println("input if else = " + input);

        //ternary
        input=45;
        input=input>100 ?input*2: input+10;
        System.out.println("ternary ile:" +input);
    }
}
