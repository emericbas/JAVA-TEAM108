package days.day17_arrays.Questions;

public class InterwiewQuestion {
    public static void main(String[] args) {
        // Task 3: Count each name in sentence.
        //input : String names = "Adam Adam Barry Aysun Aysun";
        //output: Adam-2 Barry-1 Aysun-2
        String names = "Adam Adam Barry Aysun Aysun";
        String result = "";
        String temp = "";
        int count=0;
        if(names.charAt(names.length()-1)!=' ')
            names = names + " ";
        while(names.length()!=0) {
            temp += names.substring(0, names.indexOf(" "));
            count++;
            names = names.substring(names.indexOf(" ") + 1);
            while((names.contains(temp))) {
                count++;
                names = names.replaceFirst(temp + " ", "");
            }
            result+=temp+"-"+count+" ";
            temp="";
            count=0;
        }
        System.out.println(result.trim());

    }
}
