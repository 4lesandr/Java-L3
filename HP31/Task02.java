import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Инициализация с разделителем
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
        System.out.println(joiner.toString());

        // Инициализация с разделителем, префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Apple");
        joiner2.add("Banana");
        joiner2.add("Cherry");
        System.out.println(joiner2.toString());
    }
}

public class Task02 {
    public static void main(String[] args) {
    }
}
