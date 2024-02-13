package oops;

public class AuditStudent extends Student {
	  public AuditStudent(String str) {
		  name=str;
	  }
	  public void gotoclass() {
		  
	  }
    public void gotoclass(String direction) {
    	System.out.println("Go to class after audit complete");
    	System.out.println("The next direction is "+direction);
    }
}
