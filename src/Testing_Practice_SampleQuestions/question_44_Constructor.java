package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class question_44_Constructor {
    public static void main(String[] args) {
      /*  Soru 44-)
        Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.
                Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve methodda tüm bilgileri değiştirin ve yeni bilgileri ekleyip yazdırın.
        Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın
        Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın. Methodda kullanıcıya yeni bir lastname sorulsun ve eski lastname degiştirilsin.

       */
        String name="Emine";
        String surname="Meric";
        int age=26;
        ChangeName(name,surname,age);
        ChangeSurname(surname);
    }
    public static void ChangeName(String name,String surname,int age){
        name="Nilay";
        surname="Bas";
        age=42;
        System.out.println(name+" "+surname+" "+age);
    }
    public static void ChangeSurname(String lastname){
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni bir surname giriniz");
        String surname=scan.nextLine();
        System.out.println(surname);
    }
}
