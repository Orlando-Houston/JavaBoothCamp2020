package Generics;
import java.util.ArrayList;
import java.util.Iterator;


public class TeacherArrayList {
    public static void main(String [] args){
        //class              obje          attribute
        ArrayList<Integer> myFirstList=new ArrayList<Integer>();//1
        //class       method
        System.out.println(myFirstList);

        myFirstList.add(1);
        System.out.println(myFirstList);
        myFirstList.add(2);
        //fonction
        System.out.println(myFirstList);


        for (int i=3;i<=100;i++){      //2
            //void      method i/integer element
            myFirstList.add(i);

        }
        System.out.println(myFirstList);
        //void     method  / 0/index
        System.out.println( myFirstList.get(0));

        printElementOfArrayList(myFirstList);//I called below method

    }
    //                      method             generic class/integer=data type /  arr=name
    public static void printElementOfArrayList(ArrayList<Integer>arr) {    //3
        for (int i = 0; i < arr.size(); i++) {     //arr.[]  arr.length we can make because statics
            //method/i=void
            System.out.println(arr.get(i));       //arrList  arrList.size()

        }
    }
    public static  void printWithiterator(ArrayList<Integer>arr){
        Iterator myIter=arr.iterator();//1

        while (myIter.hasNext()){  //2
            System.out.println(myIter.next());  //3
        }
    }
}
