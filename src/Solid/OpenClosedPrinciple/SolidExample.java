package Solid.OpenClosedPrinciple;

public class SolidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle= new Circle(10.2);
		double circlearea = circle.area();
		System.out.println(circlearea);
		
		Square s= new Square(10);
		double sqaurearea = s.area();
		System.out.println(sqaurearea);

	}

}
