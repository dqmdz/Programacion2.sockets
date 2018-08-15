package ar.edu.um.programacion2.reflexion;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Method sumInstanceMethod = Operations.class.getMethod("publicSum", int.class, double.class);

		Method multiplyStaticMethod = Operations.class.getMethod("publicStaticMultiply", float.class, long.class);

		Method andPrivateMethod = Operations.class.getDeclaredMethod("privateAnd", boolean.class, boolean.class);

		Method maxProtectedMethod = Operations.class.getDeclaredMethod("protectedMax", int.class, int.class);
	}
}
