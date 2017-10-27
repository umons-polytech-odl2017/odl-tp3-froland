package exercice1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExerciseForm {
	private JPanel panel1;
	private JPanel drawingPanel;
	private JRadioButton rectangleBtn;
	private JRadioButton squareBtn;
	private JRadioButton ellipsisBtn;
	private JRadioButton circleBtn;
	private JTextArea messageArea;

	public static void main(String[] args) {
		JFrame frame = new JFrame("ExerciseForm");
		frame.setContentPane(new ExerciseForm().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private void createUIComponents() {
		drawingPanel = new JPanel();
	}
}
