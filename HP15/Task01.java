public class A {
    {
        System.out.println("logic (1) id= " + this.id); // Вывод: logic (1) id= 0
    }

    static {
        System.out.println("static logic"); // Вывод: static logic
    }

    private int id = 1;

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id); // Вывод: ctor id= 100
    }

    {
        System.out.println("logic (2) id= " + id); // Вывод: logic (2) id= 1
    }
}

public class Main {
    public static void main(String[] args) {
        new A(100);
    }
}

- Статический блок static logic выполняется один раз при загрузке класса A.
- Инициализационный блок logic (1) выполняется перед конструктором, но до инициализации переменной id, поэтому выводится 0 (default).
- Инициализация переменной id происходит после выполнения блока logic (1).
- Второй инициализационный блок logic (2) выводит id, который к этому моменту уже инициализирован с 1.
- Конструктор ctor id= 100 выполняется последним, устанавливая id в 100 для текущего объекта, и выводит это значение.