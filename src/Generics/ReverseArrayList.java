package Generics;
import java.util.ArrayList;
import java.util.Arrays;


public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        reverseIntger(arr1);
    }
    public static void reverseIntger(ArrayList<Integer> arr){
        ArrayList<Integer> arrNew = new ArrayList<>();
        for (int i = arr.size()-1; i >=0 ; i--) {
            arrNew.add(arr.get(i));
        }
        System.out.println(arrNew);
    }

}
