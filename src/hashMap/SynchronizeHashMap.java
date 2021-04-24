package hashMap;
import java .util.*;

public class SynchronizeHashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap<Integer, String> ();

        hashMap.put (26,"Brade");
        hashMap.put (13,"Broccoli");
        hashMap.put (39,"cucumber");
        hashMap.put (75,"Tomato");
        hashMap.put (62,"Avakado");
        Map  map= Collections.synchronizedMap (hashMap);
        Set set=map.entrySet ();
        synchronized (map){
            Iterator i=set.iterator ();
            //Display Elements
            while (i.hasNext ()){
                Map.Entry me=(Map.Entry)i.next ();
                System.out.print (me.getKey ()+":");
                System.out.println (me.getValue ());
            }
        }
    }}


