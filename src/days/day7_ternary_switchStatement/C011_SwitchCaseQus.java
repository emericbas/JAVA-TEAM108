package days.day7_ternary_switchStatement;

public class C011_SwitchCaseQus {
    public static void main(String[] args) {
        //Question 4- Get a letter from the user that he/she wants to know the meaning of it from the
        //abbreviation ISTQB; print the description of the desired letter.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        char harf='b';
        switch(harf){

            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                    System.out.println("Invalid letter");

        }
    }
}
