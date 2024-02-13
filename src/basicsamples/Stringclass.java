package basicsamples;

public class Stringclass {

	public static void main(String[] args) {
		String first="Java is a object oriented programming Language";
		String second="Python";
		String third="Language";
		System.out.println(first+", "+second+", "+third);
        //Length of the string
		System.out.println(first.length());
		//charAt
		System.out.println(first.charAt(0));
		//Substring 
		System.out.println(first.substring(10,16));
		//Concat the string
		String join=second.concat(third);
		System.out.println(join);
		//Split method
		String arr[]=first.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//check the strings are equal
		String s1="Java";
		String s2="java";
		boolean a=s1.equals(s2);    //false
		System.out.println(a);   
		boolean b=s1.equalsIgnoreCase(s2);//true
		System.out.println(b);
		String s3=new String("Java");
		String s4=new String("Java");
		if(s3==s4)
			System.out.println("s3 and s4 are in same reference");
		else
			System.out.println("s3 and s4 are in different reference");// true
		String s5="Java";
		String s6="Java";
		if(s5==s6)
			System.out.println("s5 and s6 are in same reference");    //true
		else
			System.out.println("s5 and s6 are in different reference");
		
		String newString=new String("Java Program");
		String newStringone=new String("Java Program");
		if(newString.equals(newStringone))
			System.out.println("Both are equal");
		System.out.println("value of new string is"+newStringone.toUpperCase());
	
	}

}
