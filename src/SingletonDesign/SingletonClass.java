package SingletonDesign;

import java.io.Serializable;

public class SingletonClass implements Cloneable{
	
	private static final long serialVersionUID = 1L;
	private SingletonClass() {
		// TODO Auto-generated constructor stub
		
		//throw new IllegalArgumentException(" ref is not possible");
	}
	
	private static  SingletonClass setInstance;
	public static SingletonClass getInstance() {
		if (setInstance==null) {
			setInstance= new SingletonClass();
		}
		return setInstance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
