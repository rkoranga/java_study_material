//Event hanlding using Adapter classes

import java.awt.*;
import java.awt.event.*;

//demo extends frame to create window
class demo extends Frame{
	//create var
	String msg="";
	int x, y;
	
	demo(){
		//create event listeners
		addMouseListener( new mymouseadapter(this) );
		addMouseMotionListener( new mymousemotionadapter(this ) );
		addWindowListener( new mywindow());
	}
	
	//paint fun - call drawString
	public void paint(Graphics g){
		g.drawString( msg, x,y );
		
	}
	
	//main fun - call setSize, setTitle, setVisible
	public static void main(String args[]){
		demo app= new demo();
		app.setSize(new Dimension (300, 300));
		app.setTitle("demo");
		app.setVisible(true);
	}
}

//handler class which extends MouseAdapter class
class mymouseadapter extends MouseAdapter{
	
	demo obj;
	
	//initialize demo obj
	mymouseadapter(demo po){
		obj=po;
	}
	
	//handler
	public void mouseClicked(MouseEvent me){
		//determine coordinates and msg
		obj.x=10;
		obj.y=100;
		obj.msg="mouse clicked";
		//call repaint
		obj.repaint();
		
	}
	
	
	
}


//handler class which extends MouseMotionAdapter
class mymousemotionadapter extends MouseMotionAdapter{
	
	demo obj;
	
	//initialize obj
	mymousemotionadapter(demo po){
		obj=po;
	}
	
	//handler 
	public void mouseMoved(MouseEvent me){
		obj.x=me.getX();
		obj.y=me.getY();
		obj.msg="mouse moved at"+obj.x+" "+obj.y;
		
		obj.repaint();
	}
	
}

//handler class to handel window events
class mywindow extends WindowAdapter{
	
	//handler to handler window closing event
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}

		
	
	
	