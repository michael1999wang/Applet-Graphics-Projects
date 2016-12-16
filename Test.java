
// The "ShapeTest" class.
// Located in: Examples\Ch10\5.efficiency\ShapeTest.java
// This applet randomly places 10 shapes on the drawing surface
// and then moves the shapes around the screen, bouncing them
// off the edges.

import java.applet.*;
import java.awt.*;

public class Test extends Applet {

	Triangle t;
	Oval o;

	public void init() {
		setSize(300, 300);
		t = new Triangle(this, 50, 150, 100);
		o = new Oval(this, 150, 150, 50, 50);
	}

	public void paint(Graphics g) {
		t.drawShape(Color.red);
		o.drawShape(Color.blue);
	}

} /* ShapeTest class */
