package game;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.color.*;
import javax.swing.JFrame;
import java.awt.Toolkit;
public class SnakeMap extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private Image bgImg=Toolkit.getDefaultToolkit().getImage(gameUI.class.getResource("/images/bg.ping"));
	
	public SnakeMap(int width, int height) throws HeadlessException {
		super();
		this.width = width;
		this.height = height;
	}
	/**
	 * 初始化地图
	 * @param args
	 */
	public void init() {
		
	}


}
