import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class diffdays {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String inputString1 = "23-01-1997";
		String inputString2 = "27-04-1997";

		LocalDate date1 = LocalDate.parse(inputString1, dtf);
		LocalDate date2 = LocalDate.parse(inputString2, dtf);
		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		System.out.println ("Days: " + daysBetween);

	}

}
