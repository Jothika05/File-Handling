package Filelearning;

import java.io.File;
import java.io.IOException;

public class FileFolderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 //1.folder creation
 //2.subfolderCreation		
		/*File file=new File("C:\\Users\\JOTHIKA\\Desktop\\smiley\\smileyqueen\\smileyking");
		boolean present=file.exists();
		System.out.println("Folder present:  "+present);
		
		if(present==false) 
			file.mkdirs();
			present=file.exists();
			System.out.println("Folder present:  "+present);    */
			
//3.file creation
    		
		
	/*	 File file=new File("C:\\Users\\JOTHIKA\\Desktop\\smiley\\test.txt");
		boolean present=file.exists();
		
		if(present==false)
			try {
				boolean created=file.createNewFile();
				System.out.println("File created :" +created);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
//4.file deletion			                                                               */
		
	/*	File file=new File("C:\\Users\\JOTHIKA\\Desktop\\smiley\\test.txt");
		file.delete();
		boolean present=file.exists();
		System.out.println("Folder present:  "+present);          */
		
//5.rename file
	  /* File file=new File("C:\\Users\\JOTHIKA\\Desktop\\smiley\\test.txt");
	    file.createNewFile();
		File newName=new File("C:\\Users\\JOTHIKA\\Desktop\\smiley\\abc.txt");
		boolean success=file.renameTo(newName);
		System.out.println("rename success:" +success);
		 
//6.printing file name
	System.out.println("file name:"+	newName.getName());
		
		
//
	System.out.println(file.canExecute());
	System.out.println(file.canRead());
	System.out.println(file.canWrite());  */
		
//7.listing all the files and folders in a directory
	
/*	File file=new File("C:\\Users\\JOTHIKA\\Desktop");
	String[] listofFilesFolders=file.list();
	for(int i=0;i<listofFilesFolders.length;i++) {
		System.out.println(listofFilesFolders[i]);
	}  */
//8.listing only files  in a directory	
	/*	File file=new File("C:\\Users\\JOTHIKA\\Desktop");
		File[] fileFolderlist=file.listFiles();
		for(File f: fileFolderlist) {
			if(f.isFile())
			System.out.println(f);}  */
			
//9.listing only folders  in a directory				
		/*	File file=new File("C:\\Users\\JOTHIKA\\Desktop");
			File[] fileFolderlist=file.listFiles();
			for(File f: fileFolderlist) {
				if(f.isDirectory())
				System.out.println(f);
		}  */
			
//10.listing only txt files in a directory	
			File file=new File("C:\\Users\\JOTHIKA\\Desktop");
			File[] fileFolderArray=file.listFiles();
			for(File f: fileFolderArray) {
				if(f.isFile()){
				    String filename=f.getName();
				    int lastDot=filename.lastIndexOf(".");
				    String extension=filename.substring(lastDot+1);
				    if(extension.equals("txt"))
				        System.out.println(extension);  
			     }	
			}
	}

}


