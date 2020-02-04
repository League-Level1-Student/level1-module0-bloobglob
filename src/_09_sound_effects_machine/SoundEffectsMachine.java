package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton sawingWood = new JButton("Sawing Wood");
	JButton woohoo = new JButton("Woohoo");
	JButton cymbal = new JButton("Cymbal");
	JButton drum = new JButton("Drum");
	JButton snare = new JButton("Snare");
	public void showButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(sawingWood);
		panel.add(woohoo);
		panel.add(cymbal);
		panel.add(drum);
		panel.add(snare);
		frame.pack();
		frame.setVisible(true);
		sawingWood.addActionListener(this);
		woohoo.addActionListener(this);
		cymbal.addActionListener(this);
		drum.addActionListener(this);
		snare.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)e.getSource();
		if(buttonPressed == sawingWood) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		if(buttonPressed == woohoo) {
			playSound("homer-woohoo.wav");
		}
		if(buttonPressed == cymbal) {
			playSound("cymbal.wav");
		}
		if(buttonPressed == drum) {
			playSound("drum.wav");
		}
		if(buttonPressed == snare) {
			playSound("snare.wav");
		}
	}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}
}
