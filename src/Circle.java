
public class Circle extends Figure
{
 double radius;

public Circle(double radius) {
	super();
	this.radius = radius;
}

public double getPerimeter() {
	return radius*3.14*2;
}

public double getArea() {
	return (radius*radius)*3.14;
}


}
