
// The "ShapeTest" class.
// Located in: Examples\Ch10\5.efficiency\ShapeTest.java
// This applet randomly places 10 shapes on the drawing surface
// and then moves the shapes around the screen, bouncing them
// off the edges.

import java.applet.*;
import java.awt.*;

public class SlidingLine extends Applet {
	protected final static int NUM_SHAPES = 100;

	// The array containing the Shape objects.
	protected Shape[] shapes = new Shape[NUM_SHAPES];

	int r,g,b;

	Color clr[] = new Color[NUM_SHAPES];

	// This method is called when the Applet object is created.
	public void init() {
		setSize(300, 300);
		// Get the width and height of the drawing surface.
		int surfaceWidth = getSize().width;
		int surfaceHeight = getSize().height;

		// Create the shapes and place them randomly on the drawing surface.
		for (int count = 0; count < NUM_SHAPES; count++) {
			r = (int) (Math.random() * 256);
			g = (int) (Math.random() * 256);
			b = (int) (Math.random() * 256);
			clr[count] = new Color(r, g, b);
			int x = (int) (Math.random() * surfaceWidth / 2);
			int y = (int) (Math.random() * surfaceHeight / 2);
			int rectWidth = 50;
			int rectHeight = 1;
			shapes[count] = new Rectangle(this, x, y, rectWidth, rectHeight);

		}
	} // init method

	// This method is called when the Applet object is activated. Slide
	// the shapes around the drawing surface for 10,000 iterations.
	// There should be no pauses for garbage collection.
	public void start() {
		setVisible(true); // Make the applet surface visible.

		// Loop 10,000 times. In each iteration, every shape has its
		// slide method called.
		while(true)
			for (int count = 0; count < NUM_SHAPES; count++) {
				shapes[count].slide();
				// delay();
			}
	} // start method

	// This method is called whenever the applet's drawing surface is
	// obscured and then revealed. We call the paint method for each
	// shape to redraw that shape (if the shape is currently visible).
	public void paint(Graphics g) {
		// For each shape, call its paint method.
		for (int count = 0; count < NUM_SHAPES; count++) {
			shapes[count].drawShape(clr[count]);
		}
	} // paint method

	public static void delay() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} /* ShapeTest class */
