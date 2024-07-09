package FunctionalInterface;

@FunctionalInterface
public interface FunctionInterfaceExample {
	
	public void saySomething(String message);
	
	default void sayhi() {
		System.out.println("hi");
	}
	
	static void sayHello() {
		System.out.println("hello");
	}

}
