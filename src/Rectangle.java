
public class Rectangle extends Figure {
	protected double length;
	protected double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getPerimeter() {
		return 2*(length*width);
	}

	public double getArea() {
		return length*width;
	}

}
