class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
    
    //Использование аннотации `@Override` помогает 
    // обнаружить ошибку, если в подклассе метод написан с 
    // отличающимся именем или сигнатурой.
    // при неправильном написании имени метода
    // @Override
    // public void eaT() {  // Ошибка, обнаруженная благодаря @Override
    //     System.out.println("Dog eats");
    // }
}

class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
    
    //Использование аннотации `@Override` помогает 
// обнаружить ошибку, если в подклассе метод написан с 
// отличающимся именем или сигнатурой.
    // при неправильном написании имени метода
    // @Override
    // public void eaT() {  // Ошибка, обнаруженная благодаря @Override
    //     System.out.println("Dog eats");
    // }

}
public class Task03 {
    public static void main(String[] args) {
        System.out.println("myau!");
    }
}
