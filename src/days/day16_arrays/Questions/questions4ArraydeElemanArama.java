package days.day16_arrays.Questions;

public class questions4ArraydeElemanArama{
    public static void main(String[] args) {
      // Question 4- Create a method that prints whether a desired element exists in a given array and,
        // if so,how many times it has been used.
int[]arr={1,2,4,5,3,6,7,4,2,3,5,1,3,2};
int arananEleman=2;
elemanArama(arr,arananEleman );
    }
    public static void elemanArama(int[]arr,int arananEleman){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==arananEleman){
                count++;
            }

        }if(count==0){
            System.out.println("aranan sayi arrayde yok");
        }else{
            System.out.println("aranan " + arananEleman + " arrayde " + count + " kadar kullanilmis.");
        }

    }
}
