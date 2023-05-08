
package Filelearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileFolderDemo2 {

	public static void main(String[] args) {
	
//11.Listing file based on their size in a directory		
		
	/*	File file=new File("C:\\Users\\JOTHIKA\\Desktop");
		File[] fileFolderArray=file.listFiles();
		for(File f: fileFolderArray) {
			if(f.isFile()){
			    String filename=f.getName();
			    int lastDot=filename.lastIndexOf(".");
			    String extension=filename.substring(lastDot+1);
			    //if(extension.equals("lnk")) //txt,lnk 
			    	if(f.length()>5000000)
			        System.out.println(filename+ "Size : "+f.length());  
		     }	
		}  */
//12.file .txt iruntha delete	
	/*	File file=new File("C:\\Users\\JOTHIKA\\Desktop\\smiley");
		File[] fileFolderArray=file.listFiles();
		for(File f: fileFolderArray) {
			if(f.isFile()){
			    String filename=f.getName();
			    int lastDot=filename.lastIndexOf(".");
			    String extension=filename.substring(lastDot+1);
			    if(extension.equals("txt")) //txt,lnk 
		
			    	 f.delete();
			        System.out.println(f.getName());  
			    }
		} */
		
//13.File writer,File Reader
		
/*		File file=new File("C:\\Users\\JOTHIKA\\Desktop\\smiley\\djk.txt");	
		try {
			file.createNewFile();
			FileWriter writer=new FileWriter(file);
			writer.write(65);
			writer.write(" hii welcome");
			writer.flush();
			writer.close();
			FileReader filereader=new FileReader(file);
			int op=filereader.read();
			while(op!=-1) {
				System.out.println((char)op);
				op=filereader.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
//14.count of characters in a file		
		
	/*	File file=new File("C:\\Users\\JOTHIKA\\Desktop\\smiley\\djk.txt");	
		try {
			file.createNewFile();
			FileWriter writer=new FileWriter(file);
			writer.write(65);
			writer.write(" hii welcome");
			writer.flush();
			writer.close();
			FileReader filereader=new FileReader(file);
			char[] ch=new char[(int)file.length()];
			System.out.println(ch.length);
			filereader.read(ch);
			for(char ch1:ch) {
				System.out.print(ch1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     */
 //15.BufferedWriter,BufferedReader,line count,sentence count,word count,charcount
		
		File file=new File("C:\\Users\\JOTHIKA\\Desktop\\smiley\\abc.txt");	
		try {
			FileWriter fwriter = new FileWriter(file); //true-->append
			BufferedWriter bwriter=new BufferedWriter(fwriter);
			//bwriter.write("Tamil");
			bwriter.write("Tamil is my mother Language.");
			bwriter.newLine();
			//bwriter.write("English");
			bwriter.write("English is my second Language.");
			bwriter.newLine();
			bwriter.write("Maths is my favorite Language. i like social science");
			//bwriter.write("Maths");
			bwriter.flush();
			bwriter.close();
			FileReader freader=new FileReader(file);
			BufferedReader breader=new BufferedReader(freader);
			String line=breader.readLine();
			int linecount=0;
		    int sentenceCount=0;
		    int wordCount=0;
		    int charCount=0;
			while(line!=null) {
			     String[] sentence=line.split("[.]");
			     sentenceCount = sentenceCount + sentence.length;
			     
			     
			     String[] words=line.split(" ");
			     wordCount=wordCount+words.length;
			     
			     System.out.println(line);
			    
				 charCount=charCount+ line.length();
				 
				 linecount++;
				 line=breader.readLine();
				 
			}
			System.out.println("no of lines: "+linecount);
			System.out.println("no of sentences : "+sentenceCount);
			System.out.println("no of words : "+wordCount);
			System.out.println("no of charactors : "+charCount);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
}}