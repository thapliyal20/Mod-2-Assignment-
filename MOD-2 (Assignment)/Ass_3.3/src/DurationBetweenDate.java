import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DurationBetweenDate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LocalDate today=LocalDate.now();
		System.out.println("Enter the date in dd mm yyyy format");
		int day=sc.nextInt();
		int mon=sc.nextInt();
		int year=sc.nextInt();
		
		LocalDate date = LocalDate.of(year,mon,day);
		Period period=today.until(date);
		System.out.println("Years "+ period.get(ChronoUnit.YEARS));
		System.out.println("Months "+ period.get(ChronoUnit.MONTHS));
		System.out.println("Days "+ period.get(ChronoUnit.DAYS));
		
		sc.close();
	}

}
