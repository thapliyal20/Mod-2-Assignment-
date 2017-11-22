import java.time.ZoneId;
import java.time.ZonedDateTime;


public class DateWithTimeZone {
		private String zone;
		public DateWithTimeZone() {

		}
		public DateWithTimeZone(String zone) {
			this.zone = zone;
		}
		public void dispDate(){
			ZonedDateTime date= ZonedDateTime.now(ZoneId.of(zone));
			System.out.println("Date:  "+ date);
		}
		
}
