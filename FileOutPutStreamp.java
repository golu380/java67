import  java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamp {
    public static void main(String[] args)  throws IOException{
        System.out.println("hii");

        FileOutputStream fos = new FileOutputStream("data.txt");

        String  message = "Hi i am leaning java advance and my topic is file handling";

        byte [] data = message.getBytes();
        // for (int index = 0; index < data.length; index++) {
        //     System.out.println(data[index]);
        // }

        fos.write(data);
        fos.close();
    }
}
