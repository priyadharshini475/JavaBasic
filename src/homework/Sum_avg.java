package homework;
import java.util.Scanner;
public class Sum_avg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int sum1=0;
        for(int i=1;i<=5;i++) {
        	sum1+=sc.nextInt();
        } 
        System.out.println("sum is "+sum1+ " average is "+(sum1/5));

	}

}
