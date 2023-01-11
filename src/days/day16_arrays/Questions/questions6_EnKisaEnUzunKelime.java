package days.day16_arrays.Questions;

public class questions6_EnKisaEnUzunKelime {
    public static void main(String[] args) {
        // Question 6- Create a method that prints the longest and shortest words in a given String array.
        String[] arr = {"Hasan", "Adem", "Sen", "Omer Faruk"};
        kisaUzunKelime(arr);
    }

    public static void kisaUzunKelime(String[] arr) {
        String enuzunKelime = arr[0];
        String enkisaKelime = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > enuzunKelime.length()) {
                enuzunKelime = arr[i];
            }
            if (arr[i].length() < enkisaKelime.length()) {
                enkisaKelime = arr[i];
            }
        }
        System.out.println("enkisaKelime = " + enkisaKelime);
        System.out.println("enuzunKelime = " + enuzunKelime);

    }
}