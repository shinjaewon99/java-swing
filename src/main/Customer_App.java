package main;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Customer_App {

	private JFrame frame;
	private JTextField txtEnterId;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_App window = new Customer_App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Customer_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("C://Users//tlswo//eclipse-workspace//main/image/welcome.jpg").getImage());
		frame.setSize(528,519);
		frame.getContentPane().add(welcomePanel);
		frame.setResizable(false);
		frame.getContentPane().add(welcomePanel);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("log in");
		lblNewLabel_1.setFont(new Font("굴림체", Font.BOLD, 23));
		lblNewLabel_1.setBounds(106, 251, 170, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtEnterId = new JTextField();
		txtEnterId.setText("Enter ID");
		txtEnterId.setToolTipText("Enter ID");
		txtEnterId.setBounds(106, 304, 170, 29);
		frame.getContentPane().add(txtEnterId);
		txtEnterId.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(106, 355, 170, 29);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setBounds(72, 307, 50, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPs = new JLabel("PS :");
		lblPs.setBounds(72, 362, 50, 22);
		frame.getContentPane().add(lblPs);
		
		
		JButton btnLogIn = new JButton("");
		btnLogIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I am  clicked");
				
			}
			
		});
		
		JButton btnNewButton = new JButton("log in");
		btnNewButton.setBounds(72, 405, 238, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
	
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

	
	class ImagePanel extends JPanel{
		
		private Image img;
		
		public ImagePanel(Image img) {
		      this.img = img;
		      setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		      setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		      setLayout(null);
		  }
		  
		
		public int getWidth() {
			return img.getWidth(null);
		}
		
		public int getHeight() {
			return img.getHeight(null);
		}
		
		  public void paintComponent(Graphics g) {
		      g.drawImage(img, 3, 0, null);
		  }
	}
}
