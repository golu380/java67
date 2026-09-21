import  java.io.Serializable;
import  java.io.ObjectOutputStream;
import  java.io.FileOutputStream;
import java.io.IOException;
class Student implements Serializable { 
 
    private int id; 
    private String name; 
    private double marks; 
 
    public Student( 
            int id, 
            String name, 
            double marks) { 
 
        this.id = id; 
        this.name = name; 
        this.marks = marks; 
    } 
 
    public void display() { 
 
        System.out.println( 
                "ID: " + id 
        ); 
 
        System.out.println( 
                "Name: " + name 
        ); 
 
        System.out.println( 
                "Marks: " + marks 
        ); 
    } 
} 
 
public class SerializationDEmo { 
 
    public static void main(String[] args) { 
 
        Student student = 
                new Student( 
                        101, 
                        "Amit", 
                        88.5 
                ); 
 
        try { 
 
            ObjectOutputStream out = 
                    new ObjectOutputStream( 
                            new FileOutputStream( 
                                    "student.ser" 
                            ) 
                    ); 
 
            out.writeObject(student); 
 
            out.close(); 
 
            System.out.println( 
                    "Object serialized successfully." 
            ); 
 
        } catch (IOException e) { 
 
            e.printStackTrace(); 
        } 
    } 
} 