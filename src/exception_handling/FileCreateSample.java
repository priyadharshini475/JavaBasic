package exception_handling;
import java.io.File;
import java.io.IOException;
public class FileCreateSample {

	public static void main(String[] args) {
		File dir=new File("C:\\Users\\priyadharshini.guna\\Desktop\\filefolder");
		File files[]=dir.listFiles();
		for(int i=0;i<files.length;i++) {
			System.out.println(files[i].getName());
		}
		boolean value=false;
	//	boolean isDir=dir.mkdir();
		boolean isDir=dir.isDirectory();
		dir.getAbsolutePath();
		dir.exists();
		if(isDir) {
			File file=new File("newFile1");
			try {
			     value=dir.createNewFile();
			     File.createTempFile("mytext","txt",dir);
			} 
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		if(value)
			System.out.println("The new file is created");
		else
			System.out.println("The file already exists");

	}

}
