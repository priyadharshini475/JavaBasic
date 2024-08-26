package basicsamples;
import java.util.Scanner;
public class Condition_check {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a");
	int a=sc.nextInt();
	if(a>0)
		 System.out.println(" a is Positive number");
	else
		System.out.println("a is Negative number");
	System.out.println("Enter b");
	int b=sc.nextInt();
	int num=0;
	while(b>=0){
		num+=b;
		b=sc.nextInt();
	}
	System.out.println(num);
	String s="Java";
	if(s=="Java") {
		System.out.println("Best Programming language");
	}
	System.out.println("Enter c");
	int c=sc.nextInt();
	if(c>0)
		System.out.println("c is positive number");
	else if(c==0)
		System.out.println("c is equal to 0");
	else
		System.out.println("c is negative number");
	
	//Nested if
	if(a>b) {
		if(a>c) 
			System.out.println("a is greater");
		else
			System.out.println("c is greater");
	}else {
		if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
	}
	//switch statement
	System.out.println("Enter month");
	int m=sc.nextInt();
	int year=sc.nextInt();
	switch(m) {
	case 1:
		System.out.println("Jan 31 days");break;
	case 2:
		if((year%4==0 && year%100!=0) || (year%400==0)) {
		System.out.println("Feb 29 days");
		break;}
		else {
		 System.out.println("Feb 28 days");	
		 break;}
	case 3:
		System.out.println("march 31 days");break;
	case 4:
		System.out.println("april 30 days");break;
	case 5:
		System.out.println("may 31 days");break;
	case 6:
		System.out.println("June 30 days");break;
	case 7:
		System.out.println("July 31 days");break;
	case 8:
		System.out.println("August 31 days");break;
	case 9:
		System.out.println("September 30 days");break;
	case 10:
		System.out.println("October 31 days");break;
	case 11:
		System.out.println("Nov 30 days");break;
	case 12:
		System.out.println("Dec 31 days");break;
	default:
		System.out.println("There is no month");
	}

}}
