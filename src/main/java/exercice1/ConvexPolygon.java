package exercice1;

import java.awt.*;

public class ConvexPolygon implements Drawable {

	private final Point[] points;

	public ConvexPolygon(Point[] points) {
		this.points = points;
	}

	@Override
	public void draw(Graphics g) {
		int[] xPoints = new int[points.length];
		int[] yPoints = new int[points.length];
		for (int i = 0; i < points.length; i++) {
			Point point = points[i];
			xPoints[i] = point.getX();
			yPoints[i] = point.getY();
		}
		g.drawPolygon(xPoints, yPoints, points.length);
	}

	private void drawLineBetweenVertices(Point vertex1, Point vertex2, Graphics g) {
		g.drawLine(vertex1.getX(), vertex1.getY(), vertex2.getX(), vertex2.getY());
	}

}
