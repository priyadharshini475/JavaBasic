package oops;

public class MNC_Student extends Student implements ScoreInterface,AttendanceInterface{
	public MNC_Student(String strname) {
		name=strname;
	}
	public void gotoclass() {
		System.out.println("Go to class after evaluation");
	}
	
	@Override
	public int getattendance() {
		// TODO Auto-generated method stub
		return 90;
	}
	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 95;
	}

}
