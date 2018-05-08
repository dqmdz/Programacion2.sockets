package ar.edu.um.programacion2.socketobject;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3924668273990924608L;
	
	int id;
	String name;
	String course;

	Student(int id,String name,String course)
	    {
	     this.id=id;
	     this.name=name;
	     this.course=course;
	    }

	void showDetails() {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Course:" + course);
	}
}
