import java.io.File;
import java.io.FilenameFilter;

public class DeleteFilesWithCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 File folder = new File(".");
		 for (File file : folder.listFiles())
		 {
		   if (file.getName().startsWith("t*.txt") || file.getName().startsWith("T*.txt")) 
		   {
			   file.delete();
		   }
		 }
	}
}
