package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateRemoving {
    //modified          //method      //class   //class//parameter
    public static void removeDuplicate(ArrayList<Integer>arr){
        ArrayList<Integer> newArr=new ArrayList<>();//empty array
        //create in(new list)// existing
        //parameter//method
        //for ( int i=0;i<arr.size();i++){ //iteration other option
        for (int element:arr){
            // if (! newArr.contains(arr.get(i))){ //method
            //value//method//parameter arr//method  get//value i
            // newArr.add(arr.get(i));
            if (!newArr.contains(element)){   //element=parameter
                //value//method
                newArr.add(element);
            }
        }
        System.out.println(newArr);
    }

    public static void main(String[] args) {
        //Class   //Class//method
        ArrayList<Integer>myList=new ArrayList<Integer>(Arrays.asList( 1,2,3,3,4,2,5,1,3,6));
        //method      //void
        removeDuplicate(myList);
    }
}
