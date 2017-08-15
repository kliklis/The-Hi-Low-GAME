import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class WB {

	private  String answer;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WB window = new WB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
				//edw einai h main mou
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Kostas\\Downloads\\BS\\palia\\EP front.jpg"));
		frame.setResizable(false);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnHigh = new JButton("High");
		btnHigh.setForeground(Color.BLACK);
		btnHigh.setBackground(Color.WHITE);
		btnHigh.setFont(new Font("Showcard Gothic", Font.ITALIC, 20));
		btnHigh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer="h";
			}
		});
		btnHigh.setBounds(36, 81, 113, 58);
		frame.getContentPane().add(btnHigh);
		
		JButton btnLow = new JButton("Low");
		btnLow.setForeground(Color.BLACK);
		btnLow.setBackground(Color.WHITE);
		btnLow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer="l";
			}
		});
		btnLow.setFont(new Font("Showcard Gothic", Font.ITALIC, 20));
		btnLow.setBounds(36, 150, 113, 58);
		frame.getContentPane().add(btnLow);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\r\n");
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setFont(new Font("Showcard Gothic", Font.PLAIN, 13));
		textArea.setEditable(false);
		textArea.setBounds(159, 81, 265, 169);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("the Hi-Low game");
		lblNewJgoodiesTitle.setForeground(Color.BLACK);
		lblNewJgoodiesTitle.setFont(new Font("Showcard Gothic", Font.BOLD, 25));
		lblNewJgoodiesTitle.setBounds(98, 11, 247, 59);
		frame.getContentPane().add(lblNewJgoodiesTitle);
		
		JButton btnNext = new JButton("Next");
		btnNext.setForeground(Color.BLACK);
		btnNext.setFont(new Font("Showcard Gothic", Font.ITALIC, 13));
		btnNext.setBackground(Color.WHITE);
		btnNext.setBounds(36, 227, 113, 23);
		frame.getContentPane().add(btnNext);
		

		
//		Scanner keyboard = new Scanner(System.in);
//		Random r = new Random();
//		int next;
//		int previous=0;
//		int counter=0;
//		boolean lose=false;
//		do{
//			do{
//			next=Math.abs((r.nextInt() % 10));
//			}while(previous==next);
//			textArea.append("****************");
//			textArea.append("Previous: "+previous);
//			textArea.append("Higher or Lower?");
//			answer = keyboard.next();
//			
//			if(answer.equals("h")&& previous<next){
//				textArea.append("win");
//			}
//			else if(answer.equals("h") && previous>next){
//				textArea.append("lose");
//				textArea.append("it was " + next);
//				lose=true;
//			}
//			else if(answer.equals("l") && previous>next){
//				textArea.append("win");
//			}
//			else if(answer.equals("l") && previous<next){
//				textArea.append("lose");
//				textArea.append("It was: " + next);
//				lose=true;
//			}
//			
//			
//			previous=next;
//			counter++;
//		}while(!lose);
//
//		keyboard.close();
//		textArea.setText("GAME OVER");
	}
}
