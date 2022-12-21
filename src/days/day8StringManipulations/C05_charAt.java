package days.day8StringManipulations;

public class C05_charAt {
    public static void main(String[] args) {
        String str="Java guzeldir";// 13 karakter var,space de dahil
        // Java'da index 0'dan baslar
        //J==>0.index, r==>12.index
        //charAt(index) ile istedigimiz index deki char'a ulasabiliriz

        // ilk a'ya ulasmak icin
        System.out.println(str.charAt(1));

        // sondan 2. harfi
        System.out.println(str.charAt(13-2));//karakter sayisi-2 . deki letter

        //sondan 4.karakteri buyuk harfle yaz
        System.out.println(str.charAt(13-4));// charAt() methodu bize char verdigi icin toUppercase(0 calismaz
        ////String metodlarini charAt() ile kullanmak istersek charAt()'den once kullanmaliyiz
        System.out.println(str.toUpperCase().charAt(13-4));//L

        System.out.println(str.charAt(18));//StringIndexOutOfBoundsExeption
        //Eger index olarak karakter sayisi veya daha buyuk bir deger girersek o index'i bulamayacagi icin hata verir.
        // Fakat altini kirmizi ile cizmez.Cunku syntax e uygun
    }
}
