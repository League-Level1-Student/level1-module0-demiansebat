package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import _05_body_part_quiz.BodyPartQuiz;

public class cutestuff implements ActionListener {
	JButton button=new JButton();
	JButton cute=new JButton();
	JButton stuff=new JButton();
void run() {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	frame.add(panel);
	frame.setVisible(true);
	panel.add(button);
	panel.add(cute);
	panel.add(stuff);
	button.addActionListener(this);
	cute.addActionListener(this);
	stuff.addActionListener(this);
	frame.setSize(500, 250);
}
void showDucks() {
     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
     try {
          URI uri = new URI(videoID);
          java.awt.Desktop.getDesktop().browse(uri);
     } catch (Exception e) {
          e.printStackTrace();
     }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource().equals(button)) {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	if (e.getSource().equals(cute)) {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	if (e.getSource().equals(stuff)) {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	
}

}
