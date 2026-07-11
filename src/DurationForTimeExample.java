import java.time.LocalTime;
import java.time.Duration;

public class DurationForTimeExample {
	public static void main(String[] args) {
		LocalTime start = LocalTime.of(9, 30);
		LocalTime end = LocalTime.of(12, 45);

		Duration duration = Duration.between(start, end);
		System.out.println("Duration in minutes: " + duration.toMinutes());
	}
}
