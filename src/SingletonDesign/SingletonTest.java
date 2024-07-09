package SingletonDesign;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		SingletonClass original = SingletonClass.getInstance();
		SingletonClass duplicate = SingletonClass.getInstance();
		System.out.println(original.hashCode());
		System.out.println(duplicate.hashCode());
		
		SingletonClass clone = (SingletonClass) original.clone();
		System.out.println(clone.hashCode());
		
		
		Class<?> ref = Class.forName("SingletonDesign.SingletonClass");
		 Constructor<SingletonClass> declaredConstructor = (Constructor<SingletonClass>) ref.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		SingletonClass newInstance = declaredConstructor.newInstance();
	System.out.println(newInstance.hashCode());
	}

}
