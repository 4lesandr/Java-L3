class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class OldLibrary {
    @Deprecated
    void oldFunction() {
        System.out.println("This function is deprecated.");
    }
}

class UncheckedExample {
    @SuppressWarnings("rawtypes")
    public void uncheckedMethod() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Example"); // Компилятор обычно предупреждает об этом
    }
}

public class Task01 {
    public static void main(String[] args) {
        // Демонстрация @Override
        Dog dog = new Dog();
        dog.makeSound(); // Вывод: Bark

        OldLibrary oldLib = new OldLibrary();
        oldLib.oldFunction(); // Предупреждение: использование устаревшего метода

        UncheckedExample example = new UncheckedExample();
        example.uncheckedMethod();
    }
}
/*@Override: Используется, чтобы указать, что метод в классе Dog переопределяет метод из суперкласса Animal.   

@Deprecated: Используется в классе OldLibrary для обозначения метода oldFunction как устаревшего. 

@SuppressWarnings: Используется в классе UncheckedExample для подавления предупреждений компилятора о "сырых типах. */