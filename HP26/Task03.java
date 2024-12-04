class Outer {
    class Inner {
        int a;
    }
    void access() {
        Inner inner = new Inner();
        System.out.println(inner.a);
    }
}
```


class Outer {
    class Inner {
        private int b;
    }
    void access() {
        Inner inner = new Inner();
        // Недоступно: inner.b если b private
    }
}


public class Task03 {
    public static void main(String[] args) {
        System.out.println("myau!");
    }
}
