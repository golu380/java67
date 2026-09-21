
import java.io.FileWriter;
import java.io.IOException;
public class Main1{

    public static void main(String[] args) {
        System.out.println("hii");

        try{
            FileWriter fw = new FileWriter("studentdata.txt",true);
            fw.write("Name: Neha\n");
            fw.write("marks : 89\n");
            fw.write("course : cs\n");
            fw.write("your may write here\n");
            fw.close();

        }catch(IOException err){
            System.out.println("error occurend"+err.getMessage());
        }
    }
}