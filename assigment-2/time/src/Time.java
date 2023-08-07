public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void display() {
        System.out.printf("%d:%d:%d", hours, minutes, seconds);
    }

    public void adjustTime() {
        minutes += seconds / 60;
        seconds = seconds % 60;
        hours += minutes / 60;
        minutes = minutes % 60;
        hours = hours % 24;
    }

    public static Time add(Time one, Time other) {
        return new Time(
                one.hours + other.hours,
                one.minutes + other.minutes,
                one.seconds + other.seconds
        );
    }

}
