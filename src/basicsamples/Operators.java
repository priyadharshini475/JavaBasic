package basicsamples;

public class Operators {

	public static void main(String[] args) {
	int a=12;
	int b=10;
	System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a*b="+(a*b));
	System.out.println("a/b="+(a/b));
	System.out.println("a%b="+(a%b));
	int ac=12;
	int bc;
	bc=ac;
	System.out.println("ac is "+ac+" bc is "+bc);
	System.out.println(a>b?"a is greater":"b is greater");
	System.out.println(a>b);//true
	System.out.println(a<b);//false
	System.out.println((5>3)&&(8>4));//true
	System.out.println((5>3)||(8<7));//true
	System.out.println(!(5<3));//true
	
	

	}

}
