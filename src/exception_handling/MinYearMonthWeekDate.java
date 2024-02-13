package exception_handling;
import java.util.Calendar;
public class MinYearMonthWeekDate {

	public static void main(String[] args) {
	   Calendar cal1=Calendar.getInstance();
	   System.out.println("Current time is: "+cal1.getTime());
		System.out.println("Min Year is "+cal1.getActualMinimum(Calendar.YEAR));
		System.out.println("Min Month is "+cal1.getActualMinimum(Calendar.MONTH));
		System.out.println("Min Week is "+cal1.getActualMinimum(Calendar.WEEK_OF_YEAR));
		System.out.println("Min Date is "+cal1.getActualMinimum(Calendar.DATE));

	}

}
