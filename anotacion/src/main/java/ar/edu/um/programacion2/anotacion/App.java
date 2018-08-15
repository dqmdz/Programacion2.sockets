package ar.edu.um.programacion2.anotacion;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import ar.edu.um.programacion2.anotacion.model.Libro;

public class App {
	public static void main(String[] args) {

		List<Object> lista = new ArrayList<Object>();
		lista.add(new Libro("Programming in C++", "Robert Lafore"));
		procesar(lista);

	}

	public static void procesar(List<Object> lista) {

		try {
			for (Object o : lista) {
				Field[] campos = o.getClass().getDeclaredFields();

				for (Field campo : campos) {
					System.out.println(campo.getName());
					Imprimible imprimir = campo.getAnnotation(Imprimible.class);
					System.out.println(imprimir);
					campo.setAccessible(true);
					if (imprimir != null) {
						if (imprimir.mayusculas() == true) {
							System.out.println(campo.get(o).toString().toUpperCase());
						} else {
							System.out.println(campo.get(o).toString());

						}
					}
					campo.setAccessible(false);
				}
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
