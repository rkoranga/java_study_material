import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class demo {

	JLabel l;
	JTextField a,b;
	JButton bb;

	demo(){
		JFrame jf=new JFrame();
		jf.setLayout(new FlowLayout() );
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(500,450);
		jf.setVisible(true);		
		
		l=new JLabel("Label");
		a=new JTextField(10);
		b=new JTextField(10);
		bb=new JButton("submit");

		
		jf.add(l);
		jf.add(a);
		jf.add(b);
		jf.add(bb);
		
		bb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				if( ae.getActionCommand().equals("submit") ){
					int x= Integer.parseInt(a.getText());
					int y=Integer.parseInt(b.getText() );
					int result= x-y;
					
					l.setText("output is :"+String.valueOf(result));
				}
			}
		}
		);
		

	}	

		public static void main(String args[]){
			SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						new demo();

					}
				}
			);
		}
	
}
		
		
