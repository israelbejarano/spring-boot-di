package com.ideas.springboot.di.app.models.domain;

/**
 * The Class ItemFactura.
 * @author Israel Bejarano
 */
public class ItemFactura {
	
	/** The producto. */
	private Producto producto;
	
	/** The cantidad. */
	private Integer cantidad;
	
	/**
	 * Instantiates a new item factura.
	 *
	 * @param producto the producto
	 * @param cantidad the cantidad
	 */
	public ItemFactura(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	/**
	 * Gets the producto.
	 *
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}
	
	/**
	 * Sets the producto.
	 *
	 * @param producto the new producto
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	/**
	 * Gets the cantidad.
	 *
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}
	
	/**
	 * Sets the cantidad.
	 *
	 * @param cantidad the new cantidad
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	/**
	 * Calcular importe.
	 *
	 * @return the integer
	 */
	public Integer calcularImporte() {
		return cantidad * producto.getPrecio();
	}
}