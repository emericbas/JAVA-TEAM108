package days.day25_Inheritance;

public class APersonel {
 protected   String isim="Isim atanmadi";
  protected  String soyisim="soyisim atanmadi";
  protected  String telefon="Telefon atanmadi";

    public void maas(){
        System.out.println("Hastanemizde uygulanan ");
    }
    public void ozelSigorta(){
        System.out.println("Tum personelin ozel saglik sigortasi yapilir ");
    }private void privateMethod(){
        System.out.println("private method calisti");
    }
}
