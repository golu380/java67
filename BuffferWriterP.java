import  java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class BuffferWriterP{

    public static void main(String[] args)  throws IOException{

        FileWriter fw = new FileWriter("neha.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("i am learning advance java");
        bw.newLine();
        bw.write("I am learning file handling");
        bw.newLine();
        bw.write("hii i am finishing");
        bw.close();
        System.out.println("hii");
    }
}