import  java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("studentdata1.txt"));

        bw.write("Hi I am neha!");
        bw.newLine();
        bw.write("I will go to college");
        bw.newLine();
        bw.write("college is best");

        bw.close();

        System.out.println("data is ...");

    }
}
