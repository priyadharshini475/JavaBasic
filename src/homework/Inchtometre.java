package homework;
import java.util.Scanner;
public class Inchtometre {

	public static void main(String[] args) {
		//Inch to metre
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inch");
        int inch=sc.nextInt();
        double metre=inch*0.0254f;
        System.out.println("The metre is "+metre);

	}

}
