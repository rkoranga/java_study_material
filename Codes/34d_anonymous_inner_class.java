//Event handling
//using anonymous inner class

import java.awt.*;
import java.awt.event.*;

class demo extends Frame{
	String msg="";
	int x, y;
	
	demo(){
		//anonymous class is created inside this listener
		addMouseListener( new MouseAdapter() {
			//handler created inside anonymous inner class
			public void mouseClicked(MouseEvent me){
				x=10;
				y=100;
				msg="mouse clicked";
			
				repaint();
		
			}	
			
		});
		
		//anonymous class is created inside this listener
		addMouseMotionListener( new MouseMotionAdapter( ) {
			
			//handler created inside anonymous inner class
			public void mouseMoved(MouseEvent me){
				x=me.getX();
				y=me.getY();
				msg="mouse moved at"+x+" "+y;
				
				repaint();
			}
		});
		
		//anonymous class is created inside this listener
		addWindowListener( new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
			
		});
	}
	
	
	public void paint(Graphics g){
		g.drawString( msg, x,y );
		
	}
	
	public static void main(String args[]){
		demo app= new demo();
		app.setSize(new Dimension (300, 300));
		app.setTitle("demo");
		app.setVisible(true);
	}
}


//No handler class is needed
		
	
	
	
	