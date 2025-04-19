package www.fileHandling.commm;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		
        File fs =new File("./sample.txt");
        if(!fs.exists()) {
        	fs.createNewFile();
        }
        
        Scanner sc=new Scanner(fs);
        while(sc.hasNext()) {
        	
        	System.out.println();
        }
        sc.close()
	}

}
