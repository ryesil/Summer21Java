package javapractice01;

public class Circle extends GeometricObject {
private double radius=1;


public Circle() {
	//super();
}
public Circle(double radius) {
	super();
	this.radius = radius;
}

public Circle(double radius, String color, boolean filled) {
	super(color,filled);
	this.radius=radius;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}

public double getArea() {
	return Math.PI*radius*radius;//Math.pow(radius,2)==>double 
}

public double getPerimeter() {
	return 2*Math.PI*radius;
}

public double getDiameter() {
	return 2*radius;
}

public String printCircle() {
	return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", isFilled()=" + isFilled()
			+ ", getDateCreated()=" + getDateCreated() + "]";
}


	
}
