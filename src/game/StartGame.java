package game;

public class StartGame {
	public static void main(String [] args) {
		gameUI snake =new gameUI();
		snake.start();
		
		PlayMusic.playBg();
//		System.out.println("hello world!");
		
	}
}
