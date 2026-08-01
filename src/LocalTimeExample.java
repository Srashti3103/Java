import java.time.LocalTime;

public class LocalTimeExample {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		LocalTime meetingTime = LocalTime.of(10, 30 );

		System.out.println("Current Time: " + now);
		System.out.println("Meeting Time: " + meetingTime);
		System.out.println("Meeting ends at: " + meetingTime.plusHours(2));
	}
}
