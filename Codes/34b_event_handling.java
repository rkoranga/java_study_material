//event handling
//separate myhandler class is created for event handlers

import java.awt.*;
import java.awt.event.*;

//extend frame class to create a window
class demo extends Frame{
	//create variables
	String msg="";
	int x, y;
	
	demo(){
		//create listeners inside constructor
		addMouseListener( new myhandler(this) );//pass obj of handler class and this obj
		addMouseMotionListener( new myhandler(this ) );
		addWindowListener( new mywindow());
	}
	
	
	public void paint(Graphics g){
		//Graphics obj calls drawString
		//drawString prints the final output
		g.drawString( msg, x,y );
		
	}
	
	public static void main(String args[]){
		//create obj
		demo app= new demo();
		//set size
		app.setSize(new Dimension (300, 300));
		app.setTitle("demo");//set title
		app.setVisible(true);//make visible
	}
}

//create handler class
class myhandler implements MouseListener , MouseMotionListener {
	//implement MouseListener and MouseMotionListener
	
	//create demo obj
	demo obj;
	
	//initialize obj
	myhandler(demo po){
		obj=po;
	}
	
	//handler func
	public void mouseClicked(MouseEvent me){
		//determine coordinates and msg
		obj.x=10;
		obj.y=100;
		obj.msg="mouse clicked";
		
		//call repaint
		obj.repaint();
		
	}
	
	//handler fun
	public void mousePressed(MouseEvent me){
		
		//determine coordinates and msg
		obj.x=20;
		obj.y=100;
		obj.msg="mouse pressed";
		
		//call repaint
		obj.repaint();
	}
	
	//create handler fun
	public void mouseReleased(MouseEvent me){
		//determine coordinates and msg
		obj.x=30;
		obj.y=100;
		obj.msg="mouse released";
		
		//call repaint
		obj.repaint();
		
	}
	
	//create handler fun
	public void mouseEntered(MouseEvent me){
		
		//determine coordinates and msg
		obj.x=40;
		obj.y=100;
		obj.msg="mouse entered";
		
		//call repaint
		obj.repaint();
	}
	
	//create handler fun
	public void mouseExited(MouseEvent me){
		
		//determine coordinates and msg
		obj.x=10;
		obj.y=100;
		obj.msg="mouse exited";
		
		//call repaint
		obj.repaint();
		
	}
		

	//handler fun
	public void mouseDragged(MouseEvent me){
		
		//determine coordinates and msg
		obj.x=me.getX();
		obj.y=me.getY();
		obj.msg="mouse dragged at"+obj.x+" "+obj.y;
		
		//call repaint
		obj.repaint();
	}
	
	//handler fun
	public void mouseMoved(MouseEvent me){
		//determine coordinates and msg
		obj.x=me.getX();
		obj.y=me.getY();
		obj.msg="mouse moved at"+obj.x+" "+obj.y;
		
		//call repaint
		obj.repaint();
	}
	
}

//create handler class for window events

class mywindow extends WindowAdapter{
	//handler to close window
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}

		
	
	
	