package days.day19_arrayList_forEachLoop.Sorular;

public class ArraydeenUzunEnKisaKELIME {
    public static void main(String[] args) {
        String[] str={"ali","humeyra","fatih","azra","serra"};
        String enUzun= str[0];
        String enKisa= str[0];

        for (String each:str
             ) {
          if(each.length()>enUzun.length()){
              enUzun=each;
          }if(each.length()<enKisa.length()){
              enKisa=each;
            }
        }
        System.out.println(enKisa+" "+enUzun);//ali humeyra
    }
}
