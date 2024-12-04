interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

class MyClass implements MyInterface {
    // Необязательно переопределять defaultMethod.
}

public class Task01 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        
        // Вызов default-метода через экземпляр класса
        myClass.defaultMethod();
        
        // Вызов static-метода напрямую через интерфейс
        MyInterface.staticMethod();
    }
}