package Testing_Practice_SampleQuestions;

import java.util.Scanner;

public class Question_20_StringUzunluk {
    public static void main(String[] args) {
       // Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
        // Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
       // Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
        // aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"yazdırın.
        // İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

              Scanner scan=new Scanner(System.in);
        System.out.println("3 letterli isim giriniz");
        String name=scan.nextLine();
        if(name.length()>3) {
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }else  if(name.substring(0,1).equalsIgnoreCase(name.substring(1,2))&& name.substring(1,2).equalsIgnoreCase(name.substring(2,3))){
            System.out.println("Dizede yinelenen karakterler var");
        }else if(!(name.substring(0,1).equalsIgnoreCase(name.substring(1,2))&& name.substring(1,2).equalsIgnoreCase(name.substring(2,3)))){
            System.out.println("String benzersiz karakterlere sahip");
        }
    }
}
