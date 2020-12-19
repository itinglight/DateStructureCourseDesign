package game;

public class StartGame {
	public static void main(String [] args) {
		SnakeUI snake =new SnakeUI();
		snake.start();
		
		PlayMusic.playBg();
//		PlayMusic.playEat();
		
//		PlayMusic.playGameover();
		
	}
}
