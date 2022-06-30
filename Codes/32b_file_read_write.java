//Program to demonstrate reading and writing to a file
import java.io.*;
class demo {
	//these are Checked Exceptions specified after throws keyword.
	//FileNotFoundException is thrown while opening file
	//IOException is thrown while using read(), write() function
	public static void main(String args[])throws FileNotFoundException, IOException{
		
		//write this string to the file
		String s="this is line\nthis is line2";
		
		//create output stream to write to the file
		FileOutputStream fout=new FileOutputStream("test.txt");
		
		//use write function to write one char at a time
		for(int i=0;i<s.length();i++){
			fout.write(s.charAt(i));
		}
	
		fout.close();

		//create input stream to read the file
		FileInputStream fin=new FileInputStream("test.txt");
		int c;
		
		//the stream returns -1 when EOF is reached
		//read return char in ascii value
		while( (c=fin.read())!=-1 ){
			//cast to char to convert c to char.
			System.out.print((char)c);
		}
	}
}
