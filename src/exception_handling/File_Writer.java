package exception_handling;
import java.io.FileWriter;
public class File_Writer {

	public static void main(String[] args) {
		String s1="Hello Everybody";
        try { 
        	FileWriter output=new FileWriter("output.txt");
        	output.write(s1);
        	output.flush();
        	output.close();
        } catch(Exception e) {
        	e.getStackTrace();
        }
	}

}
