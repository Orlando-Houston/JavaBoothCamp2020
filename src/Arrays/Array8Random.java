package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Array8Random {
    public static void main(String[] args) {
        int [] number = new int[10];//uzunluğu 10 olan diziyi oluşturduk

        for (int i = 0; i < number.length ; i++) {
            number[i] = (int)(Math.random()*100); //tek tek değer atıyoruz
            System.out.println(number[i]);
        }
    }

    }



