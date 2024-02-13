package exception_handling;
import java.util.Calendar;

public class NoOfMonthLeftInTheYear {

	public static void main(String[] args) {
		Calendar cal1=Calendar.getInstance();
		System.out.println("The Current date is: "+cal1.getTime());
		int currentMonth=cal1.get(Calendar.MONTH);
	    System.out.println("The number of month left in the year is "+(11-currentMonth));

	}

}
