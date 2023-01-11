package days.day11_forLoop;

public class C10_NestedLoop {
    public static void main(String[] args) {
        /*

        1                    1st line print 1 to 1
        1 2                 2nd line print 1 to 2
        1 2 3               3rd line print 1 to 3
        1 2 3 4              4th line print 1 to 4

         */
        int input=4;
        for (int i = 1; i <=input ; i++) {// 4 satir oldugu icin outer loop 1-4 arasi olacak
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println("");

        }

    }
}
