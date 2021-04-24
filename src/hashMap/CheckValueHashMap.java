package hashMap;

import java.util.HashMap;

public class CheckValueHashMap {
    public static void main(String[] args) {
        //creating a hashmap of int keys and String value
        HashMap<Integer,String> hashMap=new HashMap <Integer, String> ();

        //Adding key  nad value pairs to HashMap
        hashMap.put (15,"sing");
        hashMap.put (16,"Song");
        hashMap.put (17,"Movie");
        hashMap.put (18,"Theatre");
        hashMap.put (19,"Opera");

        //Checking Key Existence
        boolean flag=hashMap.containsValue ("Song");
        System.out.println ("String Songh exist in HashMap");


    }
}
