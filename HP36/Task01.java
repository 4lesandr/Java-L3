public class MultipleExceptionsExample {
    public static void main(String[] args) {
        // Пример 1
        try {
            // Генерация исключений
            int[] array = {1, 2, 3};
            System.out.println(array[5]);  // ArrayIndexOutOfBoundsException
            int division = 10 / 0;  // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            // Exception caught: ArrayIndexOutOfBoundsException - <сообщение>
        }
    }
}

class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Task01 {
    public static void main(String[] args) {
        // Пример 2
        try {
            throw new Ex3(); // Генерация Ex3
        } catch (Ex1 e) {
            System.out.println("Caught: " + e.getClass().getSimpleName());
            // Caught: Ex3
        }
    }
}