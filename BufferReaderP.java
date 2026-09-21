import  java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;


public class BufferReaderP {
    public static void main(String[] args) {
        System.out.println("hiii");
        try{
             BufferedReader br = new BufferedReader(new FileReader("neha.txt"));
             String line;
             while((line = br.readLine()) != null){
                System.out.println(line);
             }
        }catch(IOException err){
            System.err.println(err);
        }

    }
}
