//program to use printwriter and  bufferedreader stream
import java.io.*;
class demo{

	//IOException is checked exception so specified using throws keyword
	//IOEXception is thrown by read function
	public static void main (String args[]) throws java.io.IOException{
		
		//pw is used to write output
		//it is a char based stream
		//System.out is byte based stream
		//pw links with System.out
		//true is specified to enable flush on new line
		PrintWriter pw=new PrintWriter(System.out, true);

		int a=100;
		String s="hello";
		//use pritnln and printf functions
		pw.println("print using printwriter");
		
		//printf is used for formatted output
		//formatted output means int and char part in the output can be specified using %d %s etc
		pw.printf("%d %d %s %n",6+5, a, s);

			
		char c;
		int i;
//		String s;

		pw.println("enter a char and integer");
		
		
		//read input using read in the system.in stream
		//it reads one char and returns ascii value
		//so convert ascii to char using (char)
		c=(char)System.in.read();

		//to remove stray '\n' from the buffer
		i=System.in.read();
		i=System.in.read();
		i=System.in.read();
		
		//use pw to print
		pw.printf("printing c and i: %c %d  --%n", c,i);


		//BufferedReader is used to read input
		//it provides buffered input which is faster than other stream
		//it is a char based stream
		
		//here System.in is linked to InputStreamReader stream, then InputStreamReader is linked to BRView
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("using BufferedReader: enter a char");
		
		//these are to remove stray '\n' in the buffer
		c=(char)br.read();
		c=(char)br.read();

		//read the input 
		c=(char)br.read();
		pw.println(c);	
	
		//br provides readLine to read one line of input
		System.out.println("using buffered reader: enter a string");
		s=br.readLine();
		s=br.readLine();
		System.out.println(s);	

	
	}
}	
