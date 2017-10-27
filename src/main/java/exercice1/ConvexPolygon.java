package exercice1;

import java.awt.*;

public class ConvexPolygon implements Drawable {

	private final Point[] points;

	public ConvexPolygon(Point[] points) {
		this.points = points;
	}

	@Override
	public void draw(Graphics g) {
		for (int i = 1; i < points.length; ++i) {
			Point currentVertex = points[i];
			Point previousVertex = points[i - 1];
			drawLineBetweenVertices(previousVertex, currentVertex, g);
		}

		Point lastVertex = points[points.length - 1];
		Point firstVertex = points[0];
		drawLineBetweenVertices(lastVertex, firstVertex, g);
	}

	private void drawLineBetweenVertices(Point vertex1, Point vertex2, Graphics g) {
		g.drawLine(vertex1.getX(), vertex1.getY(), vertex2.getX(), vertex2.getY());
	}

}
