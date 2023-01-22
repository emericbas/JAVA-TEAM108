package GenelTekrar;

public class REgexKarakterler {
    public static void main(String[] args) {
        //regex=butun harfler,butun rakamlar,butun sembller,
     //   \\d butun rakamlar
        String test="Java  12345^&**";
        //butun rakamlar *'a donussun
        System.out.println(test.replaceAll("\\d","*"));
        System.out.println(test);//Java  12345^&** String immutable originali degismedi

         // \\D rakamlar disinda hersey
       String hesapNumarasi="tr2345 23456 23456 2345";
       //sadece sayilari alalim,bosluk da olmasin
        System.out.println(hesapNumarasi.replaceAll("\\D",""));

        // \\S space disindaki herseyi siliyor
        System.out.println(hesapNumarasi.replaceAll("\\S",""));

        // \\s boslugu siler
        // \\ w  a-z A-Z 0-9 _ kapsadigi degerler
        // \\ W yukaridakinin disindaki herseyi kapsar
        System.out.println(hesapNumarasi.replace("2345","0000"));
    }
}
