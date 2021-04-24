package Generics;
//Write a java method to remove given string in string arraylist

import java.util.ArrayList;
import java.util.Arrays;


public class RemoveDuplicateStringArray {
    public static void main(String[] args) {
        ArrayList<String> myList=new ArrayList<String>(Arrays.asList("Houston","Houston","Dallas","Austin" ));
        removeDuplicateString(myList);

    }                       //method         Class     Class  parameter
    public static void removeDuplicateString(ArrayList<String>arr){

        ArrayList<String> emptyArray=new ArrayList<>();//empty Array List

        for ( int i=0;i<arr.size();i++){
            //  for (String element:arr){
            //void
            // if (!emptyArray.contains(element)){//every element of input
            //  emptyArray.add(element);
            if (! emptyArray.contains(arr.get(i))){
                emptyArray.add(arr.get(i));
            }

        }

        System.out.println(emptyArray);
    }
}
