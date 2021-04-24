package hashMap;

import java.util.HashMap;

public class CheckKey {
    public static void main(String[] args) {
        // creating a HashMap of int Keys and String values
        HashMap<Integer,String> hashMap=new HashMap<Integer, String> ();

        // Add Key and Value pairs to HashMap
        hashMap.put (1,"A");
        hashMap.put (2,"B");
        hashMap.put (3,"C");
        hashMap.put (4,"D");
        hashMap.put (5,"E");
        hashMap.put (6,"F");
        hashMap.put (7,"G");
        hashMap.put (8,"H");

        //Checking Key Existence
        boolean flag=hashMap.containsKey (4);
        System.out.println ("Key 4 exist in HashMap?:"+flag);

        boolean flag2=hashMap.containsKey (6);
        System.out.println ("Key 6 exist in HashMap:"+flag2);

        boolean flag3=hashMap.containsKey (8);
        System.out.println ("Key 8 exist in HashMap:"+flag2);


    }

}
