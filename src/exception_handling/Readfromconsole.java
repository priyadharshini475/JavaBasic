package exception_handling;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Readfromconsole {

	
	public static void process(String str) {
		System.out.println("Processing...>"+str+"\n");
	}
	public static void doReadFromStdin() throws ApplicationException{
		BufferedReader inStream=new BufferedReader(new InputStreamReader(System.in));
	    String inLine="";
	 while(!(inLine.equalsIgnoreCase("quit")) && !(inLine.equalsIgnoreCase("exit"))) {
		 System.out.println("prompt>");
		 try {
			 inLine=inStream.readLine();
		 }	 
		 catch(IOException e){
			 throw new ApplicationException(e.toString(),e);
		 }
		 process(inLine);
	 }
	}
    public static void main(String[] args) throws ApplicationException{
		doReadFromStdin();

	}
}
