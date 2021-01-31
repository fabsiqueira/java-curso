package entities;

public class Rectangle {

	public double width;
	public double height; 
	
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return (2 * width) + (2 * height);
	}
	public double diagonal() {
		double quadrado1 = Math.pow(width, 2);
		double quadrado2 = Math.pow(height, 2);
		double soma = quadrado1 + quadrado2;
		return Math.sqrt(soma);
	}
	
}
