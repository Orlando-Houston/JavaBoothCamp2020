package Generics;
/*Create integer arraylist and add 100 random int numbers 0 1000
1-Find min number
2-Find max number
3-Find middle number (median)
4-Find largest 3 numbers
5-Find smallest 3 number
*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class MinMaxOthers {
    public static void main(String[]args){
        ArrayList<Integer>arr=new ArrayList<Integer>();
        double rand;
        for (int i=0;i<20;i++){
            rand=Math.random()*50;
            arr.add((int)rand);
        }
        System.out.println(arr);//random list
        //class   //method //
        Collections.sort(arr);//sort list make method
        System.out.println(arr);//sorted list
        System.out.println(arr.get(0));  //index 0=  min value.....important

        System.out.println(arr.get(arr.size()-1));//size-1=last index   find max number
        System.out.println(arr.get(arr.size()/2)); //midle number


        for (int i=arr.size()-4; i<arr.size();i++){
            System.out.println(arr.get(i));
        }



    }

}
