package days.day7_ternary_switchStatement;

public class C07SwitchStatement {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin
        //ve kullaniciya istedigi islemi sorun
        //+,-,*,/ isaretlerinden hangisini girerse
        // 2 sayi icin o islemi yapin
        //bu isaretlerden birini girmezse
        //"Yanlis islem tercihi "yazdirin

        int sayi1=10;
        int sayi2=2;
        char islem='*';
        // if else ile yaopalim
        if(islem=='+') {

        }else if (islem=='-'){System.out.println("Sayilarin farki :" + (sayi1 - sayi2));
        }else if (islem=='*'){System.out.println("Sayilarin carpimi :" + (sayi1 * sayi2));
        }else if (islem=='/'){System.out.println("Sayilarin bolumu :" + (sayi1 /sayi2));
        }else  {System.out.println("yanlis islem tercihi" );
        }
        System.out.println("********************");
        //Switch ile yapalim
        // bitmesini istedigin yere  break yazmaliyiz.Yazmazsan sonuna kadar islemleri yapar
        // default u else gibi dusun

        switch (islem) {
            case '+':
                System.out.println("Sayilarin toplami :" + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println("Sayilarin farki :" + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println("Sayilarin carpimi :" + (sayi1 * sayi2));
                break;
            case'/':
                System.out.println("Sayilarin bolumu :" + (sayi1 /sayi2));
                break;
            default:
                System.out.println("yanlis islem tercihi" );


        }
    }
}
