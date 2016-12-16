
// The "ShapeTest" class.
// Located in: Examples\Ch10\5.efficiency\ShapeTest.java
// This applet randomly places 10 shapes on the drawing surface
// and then moves the shapes around the screen, bouncing them
// off the edges.

import java.applet.*;
import java.awt.*;

public class RectangleMultiColorScatter extends Applet {
	protected final static int NUM_SHAPES = 100;

	Rectangle rArray[] = new Rectangle[NUM_SHAPES];

	int x, y, r, g, b;

	Color clr[] = new Color[NUM_SHAPES];

	// This method is called when the Applet object is created.
	public void init() {
		setSize(300, 300);
		// Get the width and height of the drawing surface.
		int surfaceWidth = getSize().width;
		int surfaceHeight = getSize().height;

		for (int i = 0; i < NUM_SHAPES; i++) {
			r = (int) (Math.random() * 256);
			g = (int) (Math.random() * 256);
			b = (int) (Math.random() * 256);
			clr[i] = new Color(r, g, b);
			x = (int) (Math.random() * surfaceWidth);
			y = (int) (Math.random() * surfaceHeight);
			rArray[i] = new Rectangle(this, x, y, 10, 10);
		}

	} // init method

	// This method is called when the Applet object is activated. Slide
	// the shapes around the drawing surface for 10,000 iterations.
	// There should be no pauses for garbage collection.
	public void start() {
		setVisible(true); // Make the applet surface visible.

		// Loop 10,000 times. In each iteration, every shape has its
		// slide method called.
		while (true) {
			for (int i = 0; i < NUM_SHAPES; i++) {
				rArray[i].slide();
				rArray[i].drawShape(clr[i]);
			}
			delay();
		}

	} // start method

	public static void delay() {
		try {
			Thread.sleep(33);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} /* ShapeTest class */
