import java.io.*; 
 
public class DeserializationDemo { 
 
    public static void main(String[] args) { 
 
        try { 
 
            ObjectInputStream in = 
                    new ObjectInputStream( 
                            new FileInputStream( 
                                    "student.ser" 
                            ) 
                    ); 
 
            Student student = 
                    (Student) in.readObject(); 
 
            in.close(); 
 
            student.display(); 
 
        } catch (IOException | 
                 ClassNotFoundException e) { 
 
            e.printStackTrace(); 
        } 
    } 
} 