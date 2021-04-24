package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class InitilationAsList {
    public static void main(String[] args) {
        //class            //obj                      // class   method
        ArrayList<String> myFamily=new ArrayList<String>(Arrays.asList("Ahmet","Altun","Rana","hamide","Afet"));
        //Class function  method
        System.out.println("Elements are"+myFamily);
    }
}
