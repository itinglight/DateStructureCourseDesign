package game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.color.*;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JFrame;
import java.awt.Toolkit;
public class SnakeMap extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	
	private Snake snake=null;
	private int snakeSize=20;
	private Bean food=null;
	private int foodX;
	private int foodY;
	private LinkedList<Snake> snakeLinked = new LinkedList<Snake>();//存snake
	private	 Random rd=new Random();//随机对象
	private	 Image bgImg = Toolkit.getDefaultToolkit().getImage(SnakeUI.class.getResource("/images/bg.png"));
	private SnakeMap snakeMap;
	
	



	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(bgImg, 0, 0, width, height, this);
		
		g.setColor(Color.RED);
		g.setFont(new Font("微软雅黑",Font.BOLD,16));
		g.drawString("当前得分：1000",width-140,30);
//		for(int i=0;len = snakeLinked.size();i<len;++i) {
//			if(i==0) {
//				g.drawImage(upImg.s)
//			}
//		}
		super.paint(g);
	}



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
		
	
		createHeadSnake();
		
	}



	private void createHeadSnake() {
		// TODO Auto-generated method stub
		snake = new Snake();
		snake.setX(rd.nextInt(width/2)+200);
		snake.setY(rd.nextInt(height/2)+200);
		snakeLinked.add(snake);
	}


}
