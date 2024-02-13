package exception_handling;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readcontent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BufferedReader reader;
        String s=sc.nextLine();
		try {
			reader = new BufferedReader(new FileReader(s));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	}

	


