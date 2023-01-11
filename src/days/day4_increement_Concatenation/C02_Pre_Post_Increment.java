package days.day4_increement_Concatenation;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {
        int a=10;
        int b=a++;//b=10,a=11
        int c=++a;//c=12,a=12
        System.out.println(a+","+b+","+c);

        int x=20;
        int y=++x;//y=21,x=21
        int z=y++;//z=21,y=22
        System.out.println(x+","+y+","+z);

        int k=30;
        System.out.println(k++);//30
        System.out.println(++k);//32
        System.out.println(k++);//32
        System.out.println(k);//33

        int sayi1=40;
        int sayi2=sayi1++;//2=40, 1=41
        int sayi3=--sayi2;//3=39,2=39
        int sayi4=--sayi1;//4=40, 1=40
        System.out.println(sayi1+","+sayi2+","+sayi3+","+sayi4);
    }
}
