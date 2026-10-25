import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
public class FormattingDatesWithDateTimeFormatter {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = now.format(formatter);
		System.out.println("Formatted:"+formattedDate);
	}
}
