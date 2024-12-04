public class Task01 {
    public static void main(String[] args) {
        // Используем конструкцию конструктора
        A obj1 = new A(10);
        System.out.println("Value of a using constructor: " + obj1.a);

        // Используем инициализацию при объявлении
        A2 obj2 = new A2();
        System.out.println("Value of a using initialization: " + obj2.a);

        // Используем инициализацию в блоке
        A3 obj3 = new A3();
        System.out.println("Value of a using block initialization: " + obj3.a);
    }
}

class A {
    public final int a;

    public A(int value) {
        a = value;
    }
}

class A2 {
    public final int a = 10;
}

class A3 {
    public final int a;

    {
        a = 20;
    }
}