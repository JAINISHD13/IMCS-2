import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyOnetoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Write content in one file
		try {
			FileWriter file1 = new FileWriter("Sample1.txt");
			file1.write("Hello World! This is a program for copying context from one file to another.");
			file1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create another file name Sample2.txt.

		File file2 = new File("Sample2.txt");
		try {
			file2.createNewFile();
			
			System.out.println("Path:"+file2.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Read content from Sample1.txt and write to Sample2.txt
		
		
		try {
			FileReader f1 = new FileReader("Sample1.txt");
			
			FileWriter f2 = new FileWriter("Sample2.txt");
			
			String str = "";
			
			int i;
			
			while((i=f1.read())!=-1)
			{
				str += (char)i;
			}
			
			System.out.println("Content in file one:"+str);
			
			f2.write(str);
			
			f2.close();
			f1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
