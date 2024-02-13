package homework;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int nu1=sc.nextInt();
	        int i, j;
	         for (i = 1; i <= nu1; i++) {
	            for (j = 1; j <= nu1 - i; j++) {
	                System.out.print(" ");
	            }
	             for (j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            
	            System.out.println();
	         }

	}

}
