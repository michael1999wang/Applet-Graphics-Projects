
// The "Oval" class.
// Located in: Examples\Ch10\5.efficiency\Oval.java
// This class handles ovals on a graphics surface. Once created, they
// can be moved, hidden, and shown again.

import java.awt.*;

public class Oval extends Shape {
	protected int xRadius, yRadius; // The x and y radius of the oval.

	// Create an oval that is to be drawn on the surface (which should
	// be either an Applet or a Frame).
	public Oval(Component surface, int x, int y, int xRadius, int yRadius) {
		super(surface, x, y, Color.blue);
		this.xRadius = xRadius;
		this.yRadius = yRadius;
		show();
	} // Oval constructor

	// Create an oval that is to be drawn on the surface (which should
	// be either an Applet or a Frame). Randomly place it on the
	// drawing surface.
	public Oval(Component surface, int xRadius, int yRadius) {
		super(surface, Color.blue);
		this.xRadius = xRadius;
		this.yRadius = yRadius;
		show();
	} // Oval constructor

	// Create an oval that is to be drawn on the surface (which should
	// be either an Applet or a Frame). Randomly place it on the
	// drawing surface. Randomly determine the x and y radius of
	// the oval.
	public Oval(Component surface) {
		super(surface, Color.blue);
		this.xRadius = (int) (Math.random() * 10) + 10;
		this.yRadius = (int) (Math.random() * 10) + 10;
		show();
	} // Oval constructor

	// Draw the shape in the specified color.
	protected void drawShape(Color shapeColor) {
		g.setColor(shapeColor);
		g.fillOval(x - xRadius, y - yRadius, 2 * xRadius, 2 * yRadius);
	} // drawShape method
} /* Oval class */