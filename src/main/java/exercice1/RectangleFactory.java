package exercice1;

public class RectangleFactory extends DrawableFactory {
	@Override
	public Drawable buildDrawable(double x1, double y1, double x2, double y2) {
		Point upperLeft = new Point((int) x1, (int) y1);
		Point lowerRight = new Point((int) x2, (int) y2);
		return new Rectangle(upperLeft, lowerRight);
	}
}
