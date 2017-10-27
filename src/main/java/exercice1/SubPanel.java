package exercice1;

import javax.swing.*;
import java.awt.*;

class SubPanel extends JPanel {
	private Drawable[] drawables = new Drawable[0];

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (Drawable drawable : drawables) {
			drawDrawable(drawable, g);
		}
	}

	private void drawDrawable(Drawable drawable, Graphics g) {
		Point[] vertices = drawable.getVertices();
		for (int i = 1; i < vertices.length; ++i) {
			Point currentVertex = vertices[i];
			Point previousVertex = vertices[i - 1];
			drawLineBetweenVertices(previousVertex, currentVertex, g);
		}

		Point lastVertex = vertices[vertices.length - 1];
		Point firstVertex = vertices[0];
		drawLineBetweenVertices(lastVertex, firstVertex, g);
	}

	private void drawLineBetweenVertices(Point vertex1, Point vertex2, Graphics g) {
		g.drawLine(vertex1.getX(), vertex1.getY(), vertex2.getX(), vertex2.getY());
	}

	void addDrawable(Drawable drawable) {
		Drawable[] drawables = new Drawable[this.drawables.length + 1];
		System.arraycopy(this.drawables, 0, drawables, 0, this.drawables.length);
		drawables[this.drawables.length] = drawable;
	}
}
