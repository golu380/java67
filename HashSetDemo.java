import java.util.HashSet;


public class HashSetDemo {
    
    public static void main(String[] args) {

        HashSet<Integer> st = new HashSet<>();
        st.add(10);
        st.add(12);
        st.add(34);
        st.add(11);
        st.add(34);
        st.add(12);
        HashSet<String> names = new HashSet<>();
        
        System.out.println(st);
        names.add("neha");
        names.add("Neha");
        names.add("nehA");
        System.out.println(names);

        
    }
}
