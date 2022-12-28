package days.day25_Inheritance;

public class BDoctor extends APersonel{


    public static void main(String[] args) {
        BDoctor dok1=new BDoctor();
        dok1.isim="Kemal";
        dok1.soyisim="Bulut";
        System.out.println(dok1.isim+","+dok1.soyisim+","+dok1.telefon);
    }
}
