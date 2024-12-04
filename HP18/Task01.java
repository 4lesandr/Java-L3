public class VarArgsExample {
    public void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public void printNumbers(String label, int... numbers) {
        System System.out.println(label);
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        VarArgsExample example = new VarArgsExample();
        example.printNumbers(1, 2, 3);
        example.printNumbers("Numbers:", 4, 5, 6);
    }
}