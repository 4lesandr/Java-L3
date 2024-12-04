public class Task01 {
    public static void main(String[] args) {
        String example = "Meow, World!";

        System.out.println(example.length());
        System.out.println(example.charAt(1));
        System.out.println(example.substring(6));
        System.out.println(example.indexOf('o'));
        System.out.println(example.toUpperCase());
        System.out.println(example.toLowerCase());
        System.out.println("  Meow  ".trim());
        System.out.println(example.replace('o', 'p'));
        System.out.println(example.equals("Meow, World!"));
        
        String[] parts = example.split(", ");
        System.out.println(parts[0] + " and " + parts[1]);
    }
}
/*length(): Возвращает длину строки.
charAt(): Возвращает символ по указанному индексу.
substring(): Возвращает подстроку с указанными индексами.
indexOf(): Возвращает индекс первого вхождения указанного символа.
toUpperCase(): Преобразует строку в верхний регистр.
toLowerCase(): Преобразует строку в нижний регистр.
trim(): Удаляет начальные и конечные пробелы в строке.
replace(): Заменяет все вхождения указанного символа на другой.
equals(): Проверяет, равны ли две строки.
split(): Разбивает строку на массив с использованием разделителя.
*/