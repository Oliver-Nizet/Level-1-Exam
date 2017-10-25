import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExamCodingExercise implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton red;
	JButton yellow;
	JButton green;
	JButton blue;
	public static void main(String[] args) {
		ExamCodingExercise ece = new ExamCodingExercise();
	}
	ExamCodingExercise() {
		frame = new JFrame();
		panel = new JPanel();
		red = new JButton();
		yellow = new JButton();
		green = new JButton();
		blue = new JButton();
		frame.add(panel);
		panel.add(red);
		panel.add(yellow);
		panel.add(green);
		panel.add(blue);
		red.setBackground(Color.red);
		red.setOpaque(true);
		yellow.setBackground(Color.yellow);
		yellow.setOpaque(true);
		green.setBackground(Color.green);
		green.setOpaque(true);
		blue.setBackground(Color.blue);
		blue.setOpaque(true);
		red.addActionListener(this);
		yellow.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(red)) {
			speak("The Color is Red");
		} else if (arg0.getSource().equals(yellow)) {
			speak("The Color is Yellow");
		} else if (arg0.getSource().equals(green)) {
			speak("The Color is Green");
		} else {
			speak("The Color is Blue");
		}
	}
}
