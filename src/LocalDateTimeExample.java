import java.time.LocalDateTime;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Now: " + current);
		System.out.println("One Week Later: " + current.plusWeeks(1));
	}
}
