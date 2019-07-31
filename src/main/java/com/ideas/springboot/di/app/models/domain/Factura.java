package com.ideas.springboot.di.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The Class Factura.
 * @author Israel Bejarano
 */
@Component
public class Factura implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1263734589819969640L;

	/** The descripcion. */
	@Value("${descripcion.factura}")
	private String descripcion;
	
	/** The cliente. */
	@Autowired
	private Cliente cliente;
	
	/** The items. */
	@Autowired
	private List<ItemFactura> items;
	
	/**
	 * Inicializar.
	 */
	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat("Jose"));
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
	}
	
	/**
	 * Destruir.
	 */
	@PreDestroy
	public void destruir() {
		System.out.println("factura destruida: ".concat(descripcion));
	}
	
	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Gets the cliente.
	 *
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * Sets the cliente.
	 *
	 * @param cliente the new cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * Gets the items.
	 *
	 * @return the items
	 */
	public List<ItemFactura> getItems() {
		return items;
	}
	
	/**
	 * Sets the items.
	 *
	 * @param items the new items
	 */
	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}
}