package game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


public class PlayMusic {
	public static AudioClip audio;
	
	public static void playBg() {
		URL url = PlayMusic.class.getClassLoader().getResource("music/bgm.wav");
		audio=Applet.newAudioClip(url);
		audio.loop(); //循环播放背景音乐
	}
	
	public static void playEat() {
		URL url = PlayMusic.class.getClassLoader().getResource("music/life.wav");
		audio=Applet.newAudioClip(url);
		audio.play();
	}
	
	public static void playGameOver() {
		URL url = PlayMusic.class.getClassLoader().getResource("music/gameover.wav");
		audio=Applet.newAudioClip(url);
		audio.play();
	}
	

}
