package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInitial {
    public static void main(String[] args){
        //class           obj       key  class    class    class   method
        ArrayList<Integer> myIntArr=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        //void   method
        myIntArr.add(10);
        myIntArr.remove(0);
        //class  function method
        System.out.println(myIntArr);
        System.out.println(myIntArr.get(0));

    }
}
