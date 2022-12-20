package Solution1;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Nth_Element {
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("current list : " +list);
        Scanner sc=new Scanner(System.in);
        System.out.println("index to be removed from the list:");
        int index=sc.nextInt();

        index= list.size()-index;
        list.remove(index);
        System.out.println("after removing : " + list);

    }
}
