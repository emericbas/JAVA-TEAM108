package Testing_Practice_SampleQuestions;

public class Question_34_StringdenIntegerToplama {
    public static void main(String[] args) {
        //  Soru 34-)
        //  Bir String'i parametre olarak kabul eden ve
        //  verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

        String str = "ade1r4d3";
        // Int toplam : 8
        //   İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
        // Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
toplam(str);

    }

    public static void toplam(String str) {
        int toplam = 0;
        String strArr[] = str.split("");
        for (String each : strArr) {
            if (Character.isDigit(each.charAt(0)))//char veri tipi Wrapper class'da Character ile olur//
            {
                toplam += Integer.valueOf(each);
            }
        }
        System.out.println(toplam);
    }
}