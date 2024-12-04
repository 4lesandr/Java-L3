interface MyInterface {
    class NestedClass {
        void func() {
            System.out.println("Inside NestedClass");
        }
    }
}

public class Task01 {
    public static void main(String[] args) {
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.func();
    }
}
