package GenelTekrar;

public class ArtirmaEksiltme {
    public static void main(String[] args) {
        int a=20;
        int b=a++;
        int c=++a;
        c=--a+ b++;
        System.out.println(a+" ,"+b+" ,"+c);

    }
}
