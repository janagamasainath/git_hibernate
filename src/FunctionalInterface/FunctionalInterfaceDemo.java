package FunctionalInterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionInterfaceExample fun=(msg)->
			System.out.println("i am function  " +msg);
			fun.sayhi();
			
		fun.saySomething("hello i am fun");
	}

}
