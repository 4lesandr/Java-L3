import java.io.FileInputStream;
import java.io.IOException;

public class Task01 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("example.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}