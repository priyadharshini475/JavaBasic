package homework;
import java.util.Scanner;
public class MinutestoYear {

	public static void main(String[] args) {
		 //Minutes into years and days
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the minutes");
        int m=sc.nextInt();
        double year_min=365*24*60;
        int year=(int)m/(int)year_min;
        int days=(int)(m/60/24)%365;
        System.out.println(year+" years and "+days+" days");

	}

}
