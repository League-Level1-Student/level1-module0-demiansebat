package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortunecookie implements ActionListener {  
	
	public void showButton() {
		System.out.println("Button clicked");
        JFrame frame= new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		   int randy = new Random().nextInt(5);
		   if( randy==(0)) {
			   JOptionPane.showMessageDialog(null, "You will go on a hike");
		   }
		   if( randy==(1)) {
			   JOptionPane.showMessageDialog(null, "You will meet Bob Ross");
		   }
			   if( randy==(2)) {
				   JOptionPane.showMessageDialog(null, "You will get eaten by a dinosaur");
			   }
				   if( randy==(3)) {
					   JOptionPane.showMessageDialog(null, "You will buy a ferari");
				   }
					   if( randy==(4)) {
						   JOptionPane.showMessageDialog(null, "You will be an engineer");
					   }
						   
	}
	   }
