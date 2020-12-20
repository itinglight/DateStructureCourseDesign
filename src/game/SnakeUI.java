package game;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class SnakeUI extends JFrame{
	private static final long serialVersionUID = 7328100275058989121L;
	private int width=800;
	private int height=600;
	private SnakeMap snakeMap;
	
	//开始游戏的方法
	public void start() {
		init(); //初始化游戏界面
	}
	
	//初始化方法
	private void init() {
		this.setAlwaysOnTop(true); //让界面保持在最上面
		this.setSize(width,height+20);//设置界面大小
		this.setLocationRelativeTo(null);//居中显示界面
		this.setTitle("贪吃蛇-itinglight");//设置页面的标题
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(SnakeUI.class.getResource("/images/yclogo.png")));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置默认点击关闭时的操作，关闭并退出
		this.setResizable(false);//界面大小不可变
		
		snakeMap = new SnakeMap(width,height); //创建游戏地图
		snakeMap.init(); //创建地图
		
		this.getContentPane().add(snakeMap); //把地图放到这个游戏节目中
		this.setVisible(true);//显示当前界面
		
	}

}
