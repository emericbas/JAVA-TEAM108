package days.day11_ForLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        //input olarak verilen sayiyi 1'e kadar yazdirin.
        // - sayilari da dusunmek lazim.
        // if ile ikiye boluyoruz
        int input=- 23;
        if (input>1){
            for (int i = input; i >=1 ; i--) {
                System.out.print(i+" ");
            }
        }else{
                for(int i=input;i<=1;i++){
                    System.out.print(i+" ");

                }

            }
        }
    }

