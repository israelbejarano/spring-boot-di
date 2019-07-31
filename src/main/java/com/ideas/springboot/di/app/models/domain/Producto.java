package com.ideas.springboot.di.app.models.domain;

/**
 * The Class Producto.
 * @author Israel Bejarano
 */
public class Producto {
	
	/** The nombre. */
	private String nombre;
	
	/** The precio. */
	private Integer precio;
	
	/**
	 * Instantiates a new producto.
	 *
	 * @param nombre the nombre
	 * @param precio the precio
	 */
	public Producto(String nombre, Integer precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the precio.
	 *
	 * @return the precio
	 */
	public Integer getPrecio() {
		return precio;
	}
	
	/**
	 * Sets the precio.
	 *
	 * @param precio the new precio
	 */
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
}