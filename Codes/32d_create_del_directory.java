//program to create and delete folders
import java.io.*;

class demo{
	public static void main(String args[]){
		
		//specify the folder names to be created.
		File f1=new File("folder1");
		File f2=new File("folder2");
		
		//create folders
		f1.mkdir();
		f2.mkdir();
		
		//delete folder1
		f1.delete();
	
	}
}
