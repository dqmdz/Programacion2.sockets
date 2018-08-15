package ar.edu.um.programacion2.reflexion;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void givenObject_whenInvokePublicMethod_thenCorrect() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method sumInstanceMethod = Operations.class.getMethod("publicSum", int.class, double.class);

		Operations operationsInstance = new Operations();
		Double result = (Double) sumInstanceMethod.invoke(operationsInstance, 1, 3);

		assertEquals((Double)4.0, result);
	}
}
