import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeExample {
	public static void main(String[] args) {
		ZonedDateTime current = ZonedDateTime.now();
		ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

		System.out.println("Local Time with Zone: " + current);
		System.out.println("New York Time: " + newYorkTime);
	}
}
