package Solid.OpenClosedPrinciple;

public class Circle implements Shape {
	
	public double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	double pi=3.4142;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi*radius*radius;
	}

}
