package Generics;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<Integer> ();
        for (int i=0;i<101;i++) {
            myList.add(i);
        }
        System.out.println(myList);
    }
}
