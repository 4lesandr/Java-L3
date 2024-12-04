import java.util.Date;

public class Task03 {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.printf("Hour (24-hour clock): %tH%n", date); // %tH: Час (00–23)
        System.out.printf("Hour (12-hour clock): %tI%n", date); // %tI: Час (1–12)
        System.out.printf("Minutes: %tM%n", date);              // %tM: Минуты
        System.out.printf("Year (four digits): %tY%n", date);   // %tY: Год в четырехзначном формате
        System.out.printf("Month (full name): %tB%n", date);    // %tB: Полное название месяца
    }
}