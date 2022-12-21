package days.day7_ternary_switchStatement;

public class C10_SwitchQUES {
    public static void main(String[] args) {
        //kullanicidan gun numarasini alin
        // haftaici haftasonu  yazdiri
        int gunNo = 9;
        switch (gunNo) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                   System.out.println("Hafta ici");
                   break;
                case 6:
                case 7:
                    System.out.println("Hafta sonu");
                    break;
                default:
                    System.out.println("Invalid day");

        }
    }
}
