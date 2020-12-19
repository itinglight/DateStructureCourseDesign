package game;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


public class PlayMusic {
	public static AudioClip audio;

	public PlayMusic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void playBg(){
		
		URL url =PlayMusic.class.getClassLoader().getResource("/music/bgm.wav");
		if(url==null) {
			System.out.println("this url is nullPointer");
		}else {
			audio =Applet.newAudioClip(url);
			audio.loop();
		}
	}

	public static void playEat(){
		
		URL url =PlayMusic.class.getClassLoader().getResource("music/life.mav");
		audio =Applet.newAudioClip(url);
		audio.loop();
	}
	public static void playGameover(){
		
		URL url =PlayMusic.class.getClassLoader().getResource("music/gameover.mav");
		audio =Applet.newAudioClip(url);
		audio.loop();
	}
	
	
}
