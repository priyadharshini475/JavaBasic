package basicsamples;

public class Helloworld {
      int i=10;
      int j=12;
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello");
		Helloworld obj1=new Helloworld();
		System.out.println(obj1.addition(10,20));
		System.out.println(Helloworld.addition(30,30));
	}
		public static int addition(int num1,int num2) {
           return num1+num2;
	}
		

}
