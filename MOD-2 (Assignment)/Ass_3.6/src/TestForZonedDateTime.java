import java.util.Scanner;
public class TestForZonedDateTime {

	public static void main(String[] args) {
		DateWithTimeZone date=new DateWithTimeZone();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the zone id: ");
		String zone=sc.next();
		date = new DateWithTimeZone(zone); 
		date.dispDate();
		sc.close();
	}

}
