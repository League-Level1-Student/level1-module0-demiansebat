package _09_sound_effects_machine;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SoundEffectsMachine {
	public static void main(String[] args) {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton();
	JButton thing=new JButton();
	JButton square=new JButton();
	panel.add(button);
	panel.add(square);
	panel.add(thing);
	frame.setVisible(true);
	frame.add(panel);
	frame.setSize(500,500);
}}
