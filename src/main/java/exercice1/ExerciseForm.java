package exercice1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExerciseForm {
	private JButton unNomInteressant;
	private JPanel panel1;
	private JTextField textField1;
	private JTextField textField2;

	public ExerciseForm() {
		unNomInteressant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField2.setText(textField1.getText());
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("ExerciseForm");
		frame.setContentPane(new ExerciseForm().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
