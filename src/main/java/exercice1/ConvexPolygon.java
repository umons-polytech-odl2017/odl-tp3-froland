package exercice1;

public class ConvexPolygon implements Drawable {

	private final Point[] points;

	public ConvexPolygon(Point[] points) {
		this.points = points;
	}

	@Override
	public Point[] getVertices() {
		return points;
	}
}
