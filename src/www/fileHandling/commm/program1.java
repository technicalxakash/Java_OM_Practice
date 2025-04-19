package www.fileHandling.commm;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


//Different ways to reading a data from text file

//1)FileInputStrream
public class program1 {

	public static void main(String[] args) throws IOException {
		
         File file=new File("./sample.txt");
         if(!file.exists()) {
        	 file.createNewFile();
         }
         
         /*
         
         FileInputStream fis=new FileInputStream(file);
         System.out.println((char)fis.read());
         
         
         //output=H
         
         
      
         */
         
         
         FileInputStream fis=new FileInputStream(file);
         int acsiicode;
         while((acsiicode=fis.read()) != -1){
        	 System.out.print((char)acsiicode);
         }
         fis.close();
         
         
         
         
	}

}
//output=Hi, I'm Akash R
//Passionate about building scalable web applications and intelligent solutions
//Experienced in Django, FastAPI, React.js, Next.js, PostgreSQL, and AWS
//Exploring AI/ML, Cloud Infrastructure
