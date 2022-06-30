//event handling
//handlers inside demo class

import java.awt.*;
import java.awt.event.*;

class mouseevents extends Frame
implements MouseListener, MouseMotionListener{

	String msg="";
	int mouseX=0, mouseY=0;

	public mouseevents(){
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MyWindowAdapter());
	}

	public void mouseClicked(MouseEvent me){
		mouseX=10;
		mouseY=100;
		msg=msg+"-- click received";
		repaint();
	}
		
	public void mouseEntered(MouseEvent me){
		mouseX=10;
		mouseY=100;
		msg="mouse entered";
		repaint();
	}

	public void mouseExited(MouseEvent me){
		mouseX=10;
		mouseY=100;
		msg="mouse exited";
		repaint();
	}
	
	public void mousePressed(MouseEvent me){
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Button Down";
		repaint();
	}
	
	public void mouseReleased(MouseEvent me){
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Button Released";
		repaint();
	}
	public void mouseDragged(MouseEvent me){
		mouseX=me.getX();
		mouseY=me.getY();
		msg="mouse at"+mouseX+" "+mouseY;
		repaint();
	}
	
	public void mouseMoved(MouseEvent me){
		msg="moving mouse at" + me.getX()+" "+ me.getY();
		repaint();
	}
	
	public void paint( Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}
		
	public static void main(String args[]){
		mouseevents appwin= new mouseevents();
		appwin.setSize(new Dimension(300,300) );
		appwin.setTitle("mouseEvents");
		appwin.setVisible(true);
	}
}

class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}


