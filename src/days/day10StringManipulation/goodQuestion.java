package days.day10StringManipulation;

public class goodQuestion {
    public static void main(String[] args) {
        //Asagidaki arama sonucunun 10 binden fazla oldugunu test edin
        String sonuc= "1-16 of over 100,000 results for \"apple\"";
        int indexOver=sonuc.indexOf("over");
        int indexResults=sonuc.indexOf("results");
        String sonucSayisiStr=sonuc.substring(indexOver+5,indexResults-1);//100,000
        // , 'den kurtul
        sonucSayisiStr= sonucSayisiStr.replace("'","");//100000
        int sonucSayisiInt=Integer.parseInt(sonucSayisiStr);//string 100000'i  int 100000'e cevirir
        if(sonucSayisiInt>10000){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
