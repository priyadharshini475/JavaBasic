package homework;
import java.util.*;
public class Reversetheword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String arr[]=input.split(" ");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(reverse(arr[i])+" ");
        }}
        public static String reverse(String str) {
        	String str1="";
        	for(int i=str.length()-1;i>=0;i--) {
        		str1+=str.charAt(i);
        	}
        	return str1;
        }
	}


