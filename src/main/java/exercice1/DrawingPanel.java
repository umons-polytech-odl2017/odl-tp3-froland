package exercice1;

import javax.swing.*;
import java.awt.*;

class DrawingPanel extends JPanel {
	private Drawable[] drawables = new Drawable[0];

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (Drawable drawable : drawables) {
			drawable.draw(g);
		}
	}


	void addDrawable(Drawable drawable) {
		Drawable[] drawables = new Drawable[this.drawables.length + 1];
		System.arraycopy(this.drawables, 0, drawables, 0, this.drawables.length);
		drawables[this.drawables.length] = drawable;
	}
}
