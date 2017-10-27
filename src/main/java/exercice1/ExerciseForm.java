package exercice1;

import javax.swing.*;

public class ExerciseForm {
	private JPanel rootPanel;
	private JPanel drawingPanel;
	private JRadioButton rectangleBtn;
	private JRadioButton squareBtn;
	private JRadioButton ellipsisBtn;
	private JRadioButton circleBtn;
	private JTextArea messageArea;
	private JPanel controlPanel;

	public static void main(String[] args) {
		JFrame frame = new JFrame("ExerciseForm");
		frame.setContentPane(new ExerciseForm().rootPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private void createUIComponents() {
		drawingPanel = new SubPanel();
	}
}
