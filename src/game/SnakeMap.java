package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class SnakeMap extends JPanel{
	private static final long serialVersionUID = -8164922728825827382L;
	private int width;
	private int height;
	private Image bgImg = Toolkit.getDefaultToolkit().getImage(SnakeUI.class.getResource("/images/bg.png"));
	
	
	public SnakeMap(int width,int height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * 初始化地图
	 */
	public void init() {
		
	}
	
	//当实现这个面板是会自动调动这个绘制的方法
	@Override
	public void paint(Graphics g) {
		g.drawImage(bgImg, 0, 0, width, height,this);
		g.setColor(Color.RED); //设置绘笔为红色
		
		g.setFont(new Font("微软雅黑",Font.BOLD,16)); //设置第一个参数是字体，第二个参数是风格，第三个参数是大小
		
		g.drawString("当前得分：0", width-140, 30); //右上角绘制当前得分
		
		
	}
}
