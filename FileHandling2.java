import  java.io.FileReader;
import java.io.IOException;

public class FileHandling2 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("students.txt");

            int ch;

            while((ch= fr.read()) != -1){

                System.out.print((char)ch);

            }
            fr.close();
        }catch(IOException err){
            System.out.println("Error " + err.getMessage());;
        }
       
    }
}
