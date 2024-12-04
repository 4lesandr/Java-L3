public enum TrafficLight {
    RED(30), GREEN(45), YELLOW(5);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class Task02 {
    public static void main(String[] args) {
        System.out.println("мяу!");
    }
}
