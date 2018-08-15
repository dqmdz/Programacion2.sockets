package ar.edu.um.programacion2.anotacion.model;

import ar.edu.um.programacion2.anotacion.Imprimible;

public class Libro {
	@Imprimible(mayusculas = true)
	private String titulo;
	@Imprimible(mayusculas = false)
	private String autor;

	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
