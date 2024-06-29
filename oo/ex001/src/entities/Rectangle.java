package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
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
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
	}

	@Override
	public String toString() {
		return "Area: "
				+ String.format("%.2f%n", area())
				+ "Perimeter: "
				+ String.format("%.2f%n", perimeter())
				+ "Diagonal: "
				+ String.format("%.2f%n", diagonal());
	}
	
	
}
