package days.day21_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        int price = 100;
        //price uzerinden %10 indirim yapip ,
        // indirimli fiyati donduren bir method olusturun
        System.out.println(indirimYap10(price));//90 burada 100 sayisini methoda gonderiyor.Methoda price yerine 100 yazip sonucu 90 buluyor.
        // methoda value 'su gider .bizim price  mainde hala.
        // Pass By Value bu demek. Kendi gitmez value gider.
        // Methodlar arasinda gonderilen variable'larin kendileri degil,value'lari diger methoda yollanir

        System.out.println(price);//100  burada price olarak 100 u goruyor ve yaziyor
        // Eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istersek atama yapariz.
    }
    public static int indirimYap10(int price){
        price=price*90/100;
        return price;
    }
}
