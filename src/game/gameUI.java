package game;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.color.*;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gameUI extends JFrame{

	private static final long serialVersionUID = 6338830603585900494L;
	
	private int width =800;
	private int height =600;


	public void start() {
		init();
	}
	
	private void init() {
	

		this.setAlwaysOnTop(true);
		this.setSize(width,height+20);
		this.setLocationRelativeTo(null);
		this.setTitle("snake games");
		//set logo
		this.setIconImage(new ImageIcon(Toolkit.getDefaultToolkit().getImage(gameUI.class.getResource("/images/yclogo.png"))).getImage()); 

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setVisible(true);
	
		
	}



}
