import java.io.File;

public class AllDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File folder = new File("C:\\");
		
		File[] files = folder.listFiles();
		
		for(File file : files)
		{
			if(file.isFile())
				System.out.println("File name:"+file);
			else
				System.out.println("Foldername:"+file);
		}
	

	}

}
