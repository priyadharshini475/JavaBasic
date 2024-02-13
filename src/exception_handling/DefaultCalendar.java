package exception_handling;
import java.util.Calendar;

public class DefaultCalendar {

	public static void main(String[] args) {
		Calendar cal1=Calendar.getInstance();
		System.out.println("YEAR: "+cal1.get(Calendar.YEAR));
		System.out.println("Month: "+(cal1.get(Calendar.MONTH))+1);
		System.out.println("Day: "+cal1.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hour: "+cal1.get(Calendar.HOUR));
		System.out.println("Minute: "+cal1.get(Calendar.MINUTE));
	}

}
