import  java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("hii..");

        try{
            BufferedReader br = new BufferedReader(new FileReader("studentdata.txt"));

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch(IOException err){
            System.out.println("error occured"+ err.getMessage());
        }

    }
}
