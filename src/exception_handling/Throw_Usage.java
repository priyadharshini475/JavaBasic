package exception_handling;

public class Throw_Usage {

	public static void main(String[] args) {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(i);
			}
			throw new InsufficientBalanceException();
		}
		catch(InsufficientBalanceException e) {
			e.print();
		}
//		InsufficientBalanceException.a=10;
//	  System.out.println(InsufficientBalanceException.a);
	    System.out.println(System.getProperty("user.name"));
	    System.out.println(System.getProperty("user.dir"));
         
	   
		  
	}

}
