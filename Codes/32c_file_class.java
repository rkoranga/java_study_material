//program to demonstrate File class
import java.io.*;
class demo{
	public static void main(String args[])

	{


		//open myfolder in the courrent folder		
		File f= new File("./myfolder");
		
		//if it is directory then obtain the list of files
		if(f.isDirectory()){
			//list function returns an array of string containing the names of files and folders in f
			String s[]=f.list();
		
		
		for(int i=0;i<s.length;i++){
		//open each file/folder in the list using f1
			File f1=new File(s[i]);

			//check if f1 is file/folder
			if(f1.isDirectory()){
			//if it is a folder then print name and size
				System.out.println(s[i]+" is a directory ");
				System.out.println("size is "+f1.length());
			}

			else{
			//if f1 is a file then print name and size of file
				System.out.println(s[i]+" is a file");
				System.out.println("size is "+f1.length());
			}
		}
	
	}
	}
}
				




			
