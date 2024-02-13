package exception_handling;

import java.io.IOException;

public class ApplicationException extends IOException{
  public ApplicationException(String msg,Throwable obj) {
	  super(msg,obj);
	  System.out.println("Application specific Exception");
  }
}
