/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class FilePlayer {

	synchronized public void syncPlay(String tone) {
		try {

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("src/Sounds/" + tone + ".wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			System.out.println(tone);

		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}
	}

	public void asyncPlay(String tone) {
		try {

			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("src/Sounds/" + tone + ".wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			System.out.println(tone);
		} catch (Exception e) {
			System.out.println("Error with playing sound.");
			e.printStackTrace();
		}
	}
}