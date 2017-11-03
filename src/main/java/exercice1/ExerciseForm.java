package exercice1;

import javax.swing.*;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExerciseForm {
	private JPanel rootPanel;
	private JPanel drawingPanel;
	private JRadioButton rectangleBtn;
	private JRadioButton squareBtn;
	private JRadioButton ellipsisBtn;
	private JRadioButton circleBtn;
	private JTextArea messageArea;
	private JPanel controlPanel;

	private RectangleFactory drawableFactory = new RectangleFactory();
	private Point firstPoint;

	public ExerciseForm() {
		rectangleBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				drawableFactory = new RectangleFactory();
			}
		});
		drawingPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				firstPoint = e.getPoint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				Point secondPoint = e.getPoint();
				Drawable drawable = drawableFactory.buildDrawable(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY());
				getDrawingPanel().addDrawable(drawable);
				getDrawingPanel().repaint();
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("ExerciseForm");
		frame.setContentPane(new ExerciseForm().rootPanel);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private void createUIComponents() {
		drawingPanel = new DrawingPanel();
	}

	public DrawingPanel getDrawingPanel() {
		return (DrawingPanel) drawingPanel;
	}
}
