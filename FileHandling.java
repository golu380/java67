import java.io.FileWriter;
import java.io.IOException;
public class FileHandling{

    public static void main(String[] args) {
        System.out.println("Hiii.");

        try{
            FileWriter fw = new FileWriter("students.txt",true);

            fw.write("Name: Jahnvi\n");
            fw.write("marks : 90\n");
            fw.write("course: BE\n");
            fw.close();
            fw.write("hii");

            System.out.println("data written successfuly");

        }catch(IOException err){
            System.out.println("erorr" + err.getMessage());
        }

        

    }
}