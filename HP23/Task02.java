class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}


//Если тип возвращаемого значения у переопределённого метода не совпадает с методом в суперклассе, 
//произойдет ошибка компиляции. Возвращаемые типы должны быть соблюдены.

public class Task02 {
    public static void main(String[] args) {
        System.out.println("myau!");
    }
}
