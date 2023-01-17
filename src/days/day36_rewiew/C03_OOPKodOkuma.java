package days.day36_rewiew;
// static method main method'dan bile once calisir. Parent'larin satatikleri de calisinca main'e geldi.Guzel Soru


    class M
    {
        static {System.out.println('A');}
        { System.out.println('B');}

        public M() {
            System.out.println('C');
        }}

    class N extends M {
        static {
            System.out.println('D');
        }

        { System.out.println('E');}

        public N()
        {
            System.out.println('F');
        }
    }

    public class C03_OOPKodOkuma {
        public static void main(String[] args) {
            N n = new N();
        }


}
