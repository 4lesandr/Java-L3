public class Task01 {
    public static void main(String[] args) {
        boolean boolValue = true;
        char charValue = 'A';
        int intValue = 42;
        double doubleValue = 3.14159;
        String strValue = "Hello";

        System.out.printf("Boolean: %b%n", boolValue);             // %b: Логическое значение
        System.out.printf("Character: %c%n", charValue);           // %c: Символьное представление
        System.out.printf("Integer: %d%n", intValue);              // %d: Десятичное целое
        System.out.printf("Hex code: %h%n", strValue);             // %h: Хэш-код
        System.out.printf("Floating-point: %.2f%n", doubleValue);  // %f: Число с плавающей точкой
    }
}