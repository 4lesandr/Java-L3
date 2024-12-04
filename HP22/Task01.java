class A {
    int a = 5;
    public void method() {
        System.out.println("Method in class A");
    }
}

class B extends A {
    public B() {
        super(); // Вызов конструктора суперкласса
    }

    @Override
    public void method() {
        super.method(); // Вызов метода суперкласса
        System.out.println("Method in class B");
    }

    public void display() {
        System.out.println("Value of a from superclass: " + super.a); // Доступ к полю суперкласса
    }
}

public class Task01 {
    public static void main(String[] args) {
        B b = new B();
        b.method();
        b.display();
    }
}

