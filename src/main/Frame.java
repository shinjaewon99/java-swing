package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// frame을 그룹핑
		JPanel panel = new JPanel();
		JLabel label = new JLabel("some text");
		JButton btn1 = new JButton("Click me ");
		JButton btn2 = new JButton("Exit");
		
		
		// 한줄
		// JTextField
		
		//한줄이상
		JTextArea txtArea = new JTextArea();
		JTextField textField = new JTextField(200);
		JPanel btnPanel = new JPanel();
		
		
		
		panel.setLayout(new BorderLayout());
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnPanel,BorderLayout.WEST);
		panel.add(txtArea,BorderLayout.CENTER);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			label.setText(txtArea.getText());
				
			}
			
		});
			
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
		
		//frame에 panel을 주입
		frame.add(panel);
		
		
		
		
		
		
		
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840,840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
