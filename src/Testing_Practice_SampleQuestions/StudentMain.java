package Testing_Practice_SampleQuestions;

import java.util.Scanner;

class Student{
    String ogrencininAdiSoyadi;
    byte age;
    char gender;
    String school = "";

    public Student(String ogrencininAdiSoyadi, byte age, char gender, String school) {
        this.ogrencininAdiSoyadi = ogrencininAdiSoyadi;
        this.age = age;
        this.gender = gender;
        this.school = school;

}

    @Override
    public String toString() {
        return "Student{" +
                "ogrencininAdiSoyadi='" + ogrencininAdiSoyadi + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", school='" + school + '\'' +
                '}';
    }

    public class StudentMain {

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            System.out.println("Lutfen ad ve soyadinizi giriniz");
            String ogrencininAdiSoyadi = sc.nextLine();

            System.out.println("Lutfen yasinizi giriniz");
            byte age = sc.nextByte();

            System.out.println("Lutfen cinsiyetinizi giriniz");
            char gender = sc.next().charAt(0);

            System.out.println("Lutfen okulunuzun adini giriniz");
            sc.nextLine();
            String school = sc.nextLine();
            Student student1 = new Student(ogrencininAdiSoyadi, age, gender, school);
            System.out.println(student1.toString());


        }


    }}


