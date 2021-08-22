package javapractice01;

public class Rectangle extends GeometricObject {
private double width=1;
private double height=1;


public Rectangle() {
	super();
}
public Rectangle(double width, double height) {
	super();
	this.width = width;
	this.height = height;
}

public Rectangle(double width, double height, String color,boolean filled) {
	super(color,filled);
	this.width=width;
	this.height=height;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}

public double getArea() {
	return height*width;
}
public double getPerimeter() {
	return 2*(height+width);
}

public String PrintRectangle() {
	return "Rectangle [width=" + width + ", height=" + height + ", getColor()=" + getColor() + ", isFilled()="
			+ isFilled() + "]";
}



	
}
