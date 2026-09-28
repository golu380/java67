import java.util.HashMap;
public class HashMapDemo {
    public static void main(String [] args){

    HashMap <Integer,String> mp = new HashMap<>();
    mp.put(101, "Amit");
    mp.put(108, "neha");
    mp.put(108,"Amit");
    mp.put(103,"janvi");
    mp.put(104,"tanmay");

   String a = mp.get(108);
   System.out.println(a);

   // when key repeates then it follow the latest updated value and put them in order


    System.out.println(mp);

    }
}
