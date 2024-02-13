package exception_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;
import java.io.FileNotFoundException;

public class PropertiesFile  {

	public static void main(String[] args) throws IOException{
	 Properties connProp=new Properties();
	 connProp.setProperty("username", "Priya");
	 connProp.setProperty("password", "priya123");
	 FileOutputStream propsFile=new FileOutputStream("Information.properties");//writing streams of raw bytes of data
	 connProp.store(propsFile," ");
     propsFile.close();
	
	String uname=null;
	String password=null;
	Properties tempProp=new Properties();
	FileInputStream obtained=new FileInputStream("Information.properties");
	tempProp.load(obtained);
	obtained.close();
	uname=tempProp.getProperty("username");
	password=tempProp.getProperty("password");
	System.out.println(uname+" "+password);
	}
}
