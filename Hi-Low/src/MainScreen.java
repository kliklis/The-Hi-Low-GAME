import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainScreen extends JFrame{

	private JButton high;
	private JButton low;
	
	private JPanel panel;
	
	public MainScreen(){
		
		panel=new JPanel();
		panel.setLayout(null);
		
		high=new JButton("High");
		low=new JButton("Low");
		
//		this.add(high);
//		this.add(low);
	
		panel.add(high);
		panel.add(low);
		
		this.setContentPane(panel);

		//high.setSize(5,5);
		int x=200;
		int y=200;
		high.setBounds(x, y, 20, 20);
		low.setBounds(10, 10, 10, 10);
		
		this.setSize(new Dimension(500,450));	
		this.setLocation(400, 100); //den doulevei
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setVisible(true);
		this.setTitle("The Hi-Low Game!");
		
		
		
	}
	
	
}
