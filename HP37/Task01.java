public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Task01 {
    public static void main(String[] args) {
        System.out.println("mew");
    }
}
