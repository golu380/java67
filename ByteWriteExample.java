import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteExample {
     public static void main(String[] args) { 
 
        try { 
 
            FileOutputStream fos = 
                    new FileOutputStream( 
                            "data.txt",true 
                    ); 
 
            String message = 
                    "Welcome to Advanced Java"; 
 
            byte[] data = 
                    message.getBytes(); 
            
        for(int i = 0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
 
            fos.write(data); 
 
            fos.close(); 
 
            System.out.println( 
                    "Data written." 
            ); 
 
        } catch (IOException e) { 
 
            e.printStackTrace(); 
        } 
    }
}
