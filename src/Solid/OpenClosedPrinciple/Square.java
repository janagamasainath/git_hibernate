package Solid.OpenClosedPrinciple;

public class Square implements Shape {
	
	public double side;
	

	public Square(double side) {
		super();
		this.side = side;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
