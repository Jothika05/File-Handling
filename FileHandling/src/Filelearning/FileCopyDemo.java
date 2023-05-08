package Filelearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//copy an image file to another another image		
       try {
		InputStream fis=new FileInputStream("C:\\Users\\JOTHIKA\\Desktop\\frd.jpg");
		OutputStream fos=new  FileOutputStream("C:\\Users\\JOTHIKA\\Desktop\\Pic.jpg");
	     int content=fis.read();
	     while(content!=-1) {
	    	 fos.write(content);
	    	 content=fis.read();
	     }
	     fos.flush();
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
       catch (Exception e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	   } 
       
	}

}
