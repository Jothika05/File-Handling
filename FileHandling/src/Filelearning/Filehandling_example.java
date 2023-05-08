package Filelearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling_example {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\JOTHIKA\\Desktop\\FileHandling");
		boolean present= f.exists();
		System.out.println("folder is already present:"+present);
		 if(present==false) {
		     f.mkdirs();
		     present= f.exists();
		     System.out.println("your folder is created successfully: "+present);
		 }
			
		File fi=new File("C:\\Users\\JOTHIKA\\Desktop\\FileHandling\\textfile1.txt");
		boolean filecretion=fi.exists();
		System.out.println("your file is already present : "+filecretion);
		try {
			filecretion=fi.createNewFile();
			if(filecretion==false) 
				System.out.println("your file is created successfully: "+filecretion); 
			    FileWriter filewriter=new FileWriter(fi);
			    filewriter.write("Today is very bad day.");
			    filewriter.flush();
			    filewriter.close();
			    FileReader filereader=new FileReader(fi);
			    int op=filereader.read();
			    while(op!=-1) {
			    	 System.out.print((char)op);
			    	 op=filereader.read();
			    }
			    
			} catch (IOException e) {
			     e.printStackTrace();
			}
		try {
			 FileWriter	filewriter = new FileWriter(fi);
			BufferedWriter b=new BufferedWriter(filewriter);
			  b.write("Today is very bad day.");
			  b.newLine();
		      b.write("because i am very depressed of my life. ");
		      b.newLine();
		      b.write("So i am telling  today is very bad.");
		      b.newLine();
		      b.write("its okay! everything happens in my life. i am very happy and enjoy this movement and move on with smile..");
		      b.flush();
		      b.close();
			  FileReader filereader=new FileReader(fi);
			  BufferedReader r=new  BufferedReader(filereader);
			  String read=r.readLine();
			  
			  while(read!=null) {
			  System.out.println(read);
			  read=r.readLine();
			  }
		   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	    
	      
	}

}
