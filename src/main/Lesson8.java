package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public void PaintComponet(Graphics g ) {
		g.drawImage(img,0 , 0 ,null);
		
	}
}
public class Lesson8 {
public static void main(String[] args) {
	JFrame frame = new JFrame("Lesson8");
	frame.setSize(640,480);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
	
	ImagePanel panel = new ImagePanel(new ImageIcon("C:\\Users\\tlswo\\eclipse-workspace\\main\\image").getImage());
	
	
	 frame.add(panel);
	
	
		frame.pack();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

}
}
