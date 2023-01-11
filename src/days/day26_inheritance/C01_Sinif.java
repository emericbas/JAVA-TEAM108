package days.day26_inheritance;
class okul{
    String okulIsmi="Yildiz koleji";
    String telefon="3234567567";
}

public class C01_Sinif extends okul{
    String sinif="11-C";
    String telefon="12234556778";
    C01_Sinif(String telefon){
        System.out.println(telefon);
        System.out.println(this.telefon);//aramaya class'tan baslar, scope'i atlar
        System.out.println(super.telefon);//aramaya parent'tan baslar

        System.out.println(okulIsmi);
        System.out.println(this.okulIsmi);
        System.out.println(super.okulIsmi);

        System.out.println(sinif);
        System.out.println(this.sinif);
        // System.out.println(super.sinif);
        // Java'da parent'da bulamadigini gidip child'a sorayim OLMAZ
        // parent class'da aranan sinif degeri olmadigindan CTE verir
    }
    public static void main(String[] args) {
        C01_Sinif obj= new C01_Sinif("4222342323");
    }
}
