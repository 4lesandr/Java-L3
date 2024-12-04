class Superclass {
    public final void finalMethod() {
        System.out.println("Final method in superclass");
    }
}

class Subclass extends Superclass {
    // Попытка переопределения final метода приведет к ошибке компиляции
    // public void finalMethod() {
    //     System.out.println("Attempting to override final method");
    // }
}

public class Task01 {
    public static void main(String[] args) {
        System.out.println("myau!");
    }
}
