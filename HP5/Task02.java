public class Task02 {
    public static void main(String[] args) {
        // Пример 1: Проверка типа объекта
        String text = "Hello, World!";
        if (text instanceof String) {
            System.out.println("text is a String");
        }
        // Вывод: text is a String

        // Пример 2: Проверка перед приведением типа
        Object obj = "This is a string";
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str);
        }
        // Вывод: This is a string

        // Пример 3: Применение к null
        String str = null;
        if (str instanceof String) {
            System.out.println("str is a String");
        } else {
            System.out.println("str is not a String");
        }
        // Вывод: str is not a String
    }
}
