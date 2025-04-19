package www.fileHandling.commm;
//Absoulte path= giving full path name  and relative path= project alli work madtairtivi ha project ali ondu folder bekiruthe adunna tagondu barodhu using . 
//seperators=\ or \\

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      //File f=new File("D:\\TestFiles\\resume.txt");=Absoulte path
      /*
      System.out.println(f.createNewFile());
      
      
      //doing deletion =returns bollean
      System.out.println(f.delete());
      
      
      //combining both
     System.out.println(f.createNewFile());
      System.out.println(f.exists());
      
      
      
      //here it will create file or if file is present it will delete file 
      if(f.exists()) {
    	  f.delete();
      }
      else {
    	  f.createNewFile();
      }
      
      
      
      //hidden files =returns hidden
      System.out.println(f.isHidden());
     
      
      //readonly
      System.out.println(f.canWrite());
      
      //removing readonly
     f.setWritable(true);
     System.out.println(f.canWrite());
     
      
       //=relative path
     File f=new File("./resume.txt");
    
     System.out.println(f.createNewFile());
     System.out.println(f.delete());
     System.out.println(f.exists());
    
		
		
	//creating one  folders
		 File f=new File("./resume11.txt");
		 System.out.println(f.mkdir());
		
		 //Creating multiple folders
		 File f=new File("./resources/binnnnnn/resume11.txt");
		 System.out.println(f.mkdirs());
		
		
		//printing each folder
		File f=new File("C:\\Users\\User\\eclipse-workspace\\AkashHome");
		System.out.println(Arrays.toString(f.list()));
		
		//output=[.classpath, .git, .project, .settings, bin, README.md, resources, src]
		  
		
		File f=new File("C:\\Users\\User\\eclipse-workspace\\AkashHome");
		System.out.println(Arrays.toString(f.listFiles()));
		
		
		output=[C:\Users\User\eclipse-workspace\AkashHome\.classpath, C:\Users\User\eclipse-workspace\AkashHome\.git, 
		        C:\Users\User\eclipse-workspace\AkashHome\.project, C:\Users\User\eclipse-workspace\AkashHome\.settings, 
		        C:\Users\User\eclipse-workspace\AkashHome\bin, C:\Users\User\eclipse-workspace\AkashHome\README.md,
		        C:\Users\User\eclipse-workspace\AkashHome\resources, C:\Users\User\eclipse-workspace\AkashHome\src]
		        		
		        		
		
		File f=new File("C:\\Users\\User\\eclipse-workspace\\AkashHome");
		System.out.println(f.getName());
		
		output=AkashHome
		  */
		
		
		
	}

}
