package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	private double area;
	private double perimeter;

	public RectTriangle(double width, double height) {
		
		area = width * height / 2;
		perimeter = width + height + Math.sqrt(width*width + height*height);
		
	}

	@Override
	public double getArea() {
		System.out.println();
		return area;
	}

	@Override
	public double getPerimeter() {
		return perimeter;
	}
}
