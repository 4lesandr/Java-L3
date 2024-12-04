public class Task02 {
    public static void main(String[] args) {
        // Преобразования между String, StringBuffer и StringBuilder

        // 1. String в StringBuffer
        String str = "Hello";
        StringBuffer sbuffer = new StringBuffer(str);

        // 2. StringBuffer в String
        String strFromBuffer = sbuffer.toString();

        // 3. String в StringBuilder
        StringBuilder sbuilder = new StringBuilder(str);

        // 4. StringBuilder в String
        String strFromBuilder = sbuilder.toString();

        // 5. StringBuffer в StringBuilder и наоборот
        StringBuffer newBuffer = new StringBuffer(sbuilder);
        StringBuilder newBuilder = new StringBuilder(sbuffer);
    }
}