package www.fileHandling.commm;
//Absoulte path= giving full path name  and relative path= project alli work madtairtivi ha project ali ondu folder bekiruthe adunna tagondu barodhu using . 
//seperators=\ or \\

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      File f=new File("D:\\TestFiles\\resume.txt");
      //System.out.println(f.createNewFile());
      
      
      //doing deletion
      System.out.println(f.delete());
      
	}

}
