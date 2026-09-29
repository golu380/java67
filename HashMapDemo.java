import java.util.HashMap;
import  java.util.Map;
public class HashMapDemo {
    public static void main(String [] args){

    HashMap <Integer,String> mp = new HashMap<>();
    mp.put(101, "Amit");
    mp.put(10, "neha");
    mp.put(108,"Amit");
    mp.put(13,"janvi");
    mp.put(104,"tanmay");
    mp.put(101, "Amit");
    mp.put(12, "neha");
    mp.put(1134,"Amit");
    mp.put(1,"janvi");
    mp.put(104,"tanmay");


   String a = mp.get(108);
   System.out.println(a);

   // when key repeates then it follow the latest updated value and put them in order

   for(Map.Entry<Integer,String> entry: mp.entrySet()){
    System.out.println(
        "key: " + entry.getKey() +"-> "  + entry.getValue()
    );
   }


    System.out.println(mp);

    }
}
