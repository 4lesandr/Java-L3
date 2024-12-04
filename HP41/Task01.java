```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        File file = new File("mew.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
```