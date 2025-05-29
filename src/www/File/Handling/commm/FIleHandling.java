package www.File.Handling.commm;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FIleHandling {

	public static void main(String[] args) throws IOException {
//		File f=new File("F:\\Testfiles\\resume.txt");
//		System.out.println(f.createNewFile());
//		System.out.println(f.isHidden());
//		System.out.println(f.canWrite());
//		f.setWritable(true);
//		System.out.println(f.canRead());
//		System.out.println(f.delete());
//		System.out.println(f.getAbsolutePath());
		
//		File f=new File("./Resources");
//		System.out.println(f.mkdir());
//		System.out.println(f.delete());
		
//		File f=new File("./Resources/Test/");
//		System.out.println(f.mkdirs());
		
		File f=new File("F:\\Testfiles");
          System.out.println(Arrays.toString( f.list()));
          System.out.println(Arrays.toString( f.listFiles()));
          
          
           
		
		
		
	}

}
