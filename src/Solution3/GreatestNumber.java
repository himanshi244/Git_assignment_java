package Solution3;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);  //object of the scanner class

        //reading input from the user
        System.out.println("enter the first number =");
        int  a= sc.nextInt();
        System.out.println("enter the first number =");
        int  b= sc.nextInt();
        System.out.println("enter the first number =");
        int  c= sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+ " is the greatest number");
        }
        else if(b>=a && b>=c){
            System.out.println(b+ " is the greatest number");
        }
        else{
            System.out.println(c+ " is the greatest number");
        }
        /* instead of if else we can also use inline if else statement->
            int largest;
            largest = c>(a>b?a:b)?c:((a>b)?a:b);
         */
    }
}
