package _09_sound_effects_machine;
import java.applet.AudioClip ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import _06_duelling_buttons.DuelingButtons;

public class SoundEffectsMachine implements ActionListener {
	JButton button = new JButton();
	JButton thing = new JButton();
	JButton square = new JButton();

	public static void main(String[] args) {
		new SoundEffectsMachine().run();
	}

	void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(square);
		panel.add(thing);
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(500, 500);
		button.addActionListener(this);
		thing.addActionListener(this);
		square.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button)) {
			playSound("labrador-barking-daniel_simon.wav");
		}
		if (e.getSource().equals(square)) {
			playSound("muscle-car-daniel_simon.wav");
		}
		if (e.getSource().equals(thing)) {
			playSound("service-bell_daniel_simon.wav");
		}
	}
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();
	}
	
}
