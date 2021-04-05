package Arrays;

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<String> nameList=new ArrayList<> ();

        nameList.add("safiye");
        nameList.add("coskun");
        nameList.add("turgay");
        nameList.add("hatice");
        nameList.add("Altun");
        nameList.add("fatma");
        for (String name:nameList){
            System.out.println(name);
        }


    }
}
