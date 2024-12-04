public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Task01 {
    public static void main(String[] args) {
        System.out.println("myau!");
    }
}

/*  `printVars();` (внутри класса A)
    `A.printVars();`
    `new A().printVars();`          */