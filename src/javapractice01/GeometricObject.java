package javapractice01;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class  GeometricObject implements Serializable {

private static final long serialVersionUID = 1L;
private String color="white";
private boolean filled=true;
private LocalDate dateCreated;


public GeometricObject() {
this.dateCreated=LocalDate.now();
}

public GeometricObject(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
	this.dateCreated=LocalDate.now();
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}

public LocalDate getDateCreated() {
	return dateCreated;
}

public void setDateCreated(LocalDate dateCreated) {
	this.dateCreated = dateCreated;
}

@Override
public String toString() {
	return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
}

public abstract double getArea();
	
public abstract double getPerimeter();	
	
}
