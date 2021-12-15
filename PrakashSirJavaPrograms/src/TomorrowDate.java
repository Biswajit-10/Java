import java.time.LocalDate;

public class TomorrowDate{
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now().plusDays(1);
		System.out.println(date);
		
		System.out.println(date.getDayOfWeek());
	}
}