package Solid.LiskovSubstitutionPrinciple;

public class Sparrow extends Bird{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		Sparrow s = new Sparrow();
		String fly = s.fly();
		System.out.println(fly);
		
	}
	
	public String fly() {
		//System.out.println("Sparrow can flow long");
		return "Sparrow can flow long";
		
	}

}
