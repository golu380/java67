import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String [] args){
        TreeMap<String,String> tmp = new TreeMap<>();

        tmp.put("Amit", "Dubey");
        tmp.put("Alia","batt");
        tmp.put("Virat","kolho");
        tmp.put("Masoom" , "sharma");
        tmp.put("Rohit","sharma");

        for(Map.Entry<String , String> entry: tmp.entrySet()){
         
            if(entry.getKey() =="Masoom"){
                System.out.println("i am singer");
                continue;
            }
               System.out.println(
                entry.getKey() + " " + entry.getValue()
                
            );
        }

      
    }
}
