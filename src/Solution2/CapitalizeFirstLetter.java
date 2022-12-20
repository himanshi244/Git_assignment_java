package Solution2;

import java.util.*;

public class CapitalizeFirstLetter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("input a sentence : " );
        String line= sc.nextLine();
        String upper_case_line="";
        Scanner a = new Scanner(line);

        while(a.hasNext()){
            String word=a.next();
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case_line.trim());

    }
}