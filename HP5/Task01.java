public class Task01 {
    public static void main main(String[] args) {
        // Присваивания и арифметические
        int a = 5;
        a += 3; // 8
        a -= 2; // 6
        a *= 4; // 24
        a /= 2; // 12
        a %= 3; // 0

        // Условный оператор
        String result = (a > 0) ? "Positive" : "Negative";

        // Логические операторы
        boolean b = true;
        boolean c = false;
        boolean logicalOr = b || c; // true
        boolean logicalAnd = b && c; // false

        // Побитовые операторы
        int bitwiseOr = a | 1; // 1
        int bitwiseXor = a ^ 1; // 1
        int bitwiseAnd = a & 1; // 0

        // Сравнительные операторы
        boolean equal = a == -1; // false
        boolean greater = a > 1; // false
        boolean greaterOrEqual = a >= 0; // true
        boolean less = a < 10; // true
        boolean lessOrEqual = a <= 0; // true

        // Сдвиги
        int shiftRight = a >> 1; // 0
        int unsignedShiftRight = a >>> 1; // 0
        int shiftLeft = a << 1; // 0

        // String конкатенация
        String str = "Hello" + " World"; // "Hello World"

        // Арифметические
        int sum = 1 + 2; // 3
        int diff = 5 - 3; // 2
        int prod = 2 * 3; // 6
        int quotient = 6 / 2; // 3
        int remainder = 7 % 3; // 1

        // Инкременты/декременты
        int x = 5;
        int preIncrement = ++x; // 6
        int postIncrement = x++; // 6, затем x становится 7
        int preDecrement = --x; // 6
        int postDecrement = x--; // 6, затем x становится 5

        // Унарные
        int bitwiseComplement = ~x; // -6
        boolean logicalNot = !b; // false

        // Операторы
        int y = (2 + 3) * 5; // 25
        int[] array = {1, 2, 3};
        int element = array[1]; // 2
    }
}
