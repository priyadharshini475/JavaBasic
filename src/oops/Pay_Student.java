package oops;

public class Pay_Student extends Student implements ScoreInterface{
	public Pay_Student(String strname) {
		name=strname;
	}
	public void gotoclass() {
		System.out.println("Go to class  directly");
	}
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 75;
	}
}
