package days.day27_Overriding;

public class EParents extends DGrandParents{
    @Override
    protected void method1() {
        System.out.println("P method1");

        // @override notasyonu overridden method ile overriding method'u ilisiklendirir
        // eger overriden method'da bu iliskiyi bozacak bir degisiklik yapilirsa
        // @override CTE verir
    }

    protected void method2(){
        System.out.println("P method2");
    }

    private void method3(){
        System.out.println("P method3");
    }
}
