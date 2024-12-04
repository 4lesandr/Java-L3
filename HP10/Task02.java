import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 5, 2};

        System.out.println(Arrays.toString(array)); // Вывод: [3, 1, 4, 5, 2]

        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // Вывод: [1, 2, 3, 4, 5]

        int index = Arrays.binarySearch(array, 3);
        System.out.println(index); // Вывод: 2

        int[] array2 = {1, 2, 3, 4, 5};
        boolean isEqual = Arrays.equals(array, array2);
        System.out.println(isEqual); // Вывод: true

        int compareResult = Arrays.compare(array, array2);
        System.out.println(compareResult); // Вывод: 0 (arrays are equal in content and order)
    }
}
