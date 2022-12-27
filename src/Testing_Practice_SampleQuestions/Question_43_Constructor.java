package Testing_Practice_SampleQuestions;

public class Question_43_Constructor {
    String name="pencil";
    int no;
    static String renk="mavi";
   public Question_43_Constructor(){
       no=12;
       renk="sari";
   }
    public  Question_43_Constructor(String name,int no,String renk){
this.name="defter";
this.no++;
    }

    public static void main(String[] args) {
       Question_43_Constructor object1= new Question_43_Constructor();
       Question_43_Constructor object2= new Question_43_Constructor("meric",20,renk);
        System.out.println(object1.name+" , "+object1.no);
        System.out.println(object2.name+" , "+object2.renk+" , "+object2.no);
    /*    Soru 43-)
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        Bu const. kullanarak en az 2 nesne oluşturun ve konsolda bu nesnelerin özellikleri yazdırın
        Ipucu: Constructor konusunu pratik yapalım.
         Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
*/



    }
}
