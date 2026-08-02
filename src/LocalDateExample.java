import java.time.LocalDate;
public class LocalDateExample {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate independenceDay = LocalDate.of(1947, 8,15);
		System.out.println("Today:"+today);
		System.out.println("Independence Day :"+independenceDay);
		System.out.println("Tommorow:"+today.plusDays(1));
	}
}
