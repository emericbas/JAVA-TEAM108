package days.day10_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="Ja1va 56Gu,zel-dir";
        //sayilardan kurtulun
        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6",""));//Java Guz,zel-dir

        str="Ja1va4 56G7u,z9el-d0ir8";
        /*
        replace() zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar
        Eger genellemeyi butun sayilari, butun space'leri, butun ozel karakterleri gibi genisletmek istersek
        replace() yerine replaceAll() kullaniriz
        Java bu genellemeleri yazabilmemiz icin regex(regular expressions)tanimlamistir

        "\\d": butun digit'ler
         */
        str=str.replaceAll("\\d","");
        System.out.println(str);

        //Ozel karakterlerden de kurtulun
        //space de ozel karekter oldugundan space'in yok olmamasi icin
        // once space yerine bir deger atayalim
        str=str.replace(" ","3");

        str=str.replaceAll("\\W","");//Java3Guzeldir
        str=str.replace("5","");
        System.out.println(str);
System.out.println("----------------------------------");

        //buradaki harf sayisini bulun
        str="ALI, 354geceleri?gule786} dost";
        System.out.println(str.replaceAll("\\w",""));//, ?}
        System.out.println(str.length());
    }
}
