import java.io.FileOutputStream;
import java.io.IOException;

public class Task02 {
    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("example.txt")) {
            outputStream.write(72);  // символ 'H'
            outputStream.write(101); // символ 'e'
            outputStream.write(108); // символ 'l'
            outputStream.write(108); // символ 'l'
            outputStream.write(111); // символ 'o'
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}