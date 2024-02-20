package rectangle.entities;

public class ORectangle {
	public double width;
	public double height;
	
	public double Area() {
		return  height * width ;
	}
	public double Perimeter() {
		return (width + height )* 2;
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(width,2)+ Math.pow(height,2));
	}
	
}
