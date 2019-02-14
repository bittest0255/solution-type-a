package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	private double area;
	private double perimeter;

	public Rectangle(double width, double height) {
		System.out.println("");
		this.width = width;
		this.height = height;
		area = width * height;
		perimeter = (width + height) * 2;
	}

	@Override
	public void resize(double rate) {
		double rewidth = width * rate;
		double reheight = height * rate;
		area = rewidth * reheight;
		perimeter = (rewidth + reheight) * 2;
	}

	@Override
	public double getArea() {
		return area;
	}

	@Override
	public double getPerimeter() {
		return perimeter;
	}
}