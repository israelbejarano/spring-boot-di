package com.ideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ideas.springboot.di.app.models.domain.ItemFactura;
import com.ideas.springboot.di.app.models.domain.Producto;
import com.ideas.springboot.di.app.models.service.IServicio;
import com.ideas.springboot.di.app.models.service.MiServicio;

@Configuration
public class AppConfig {

	@Bean("miServicio")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto p1 = new Producto("camara de fotos", 100);
		Producto p2 = new Producto("barra halterofilia", 200);
		
		ItemFactura linea1 = new ItemFactura(p1, 2);
		ItemFactura linea2 = new ItemFactura(p2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina() {
		Producto p1 = new Producto("Monitor", 150);
		Producto p2 = new Producto("Torre pc", 400);
		Producto p3 = new Producto("teclado", 50);
		Producto p4 = new Producto("raton", 25);
		
		ItemFactura linea1 = new ItemFactura(p1, 2);
		ItemFactura linea2 = new ItemFactura(p2, 1);
		ItemFactura linea3 = new ItemFactura(p3, 1);
		ItemFactura linea4 = new ItemFactura(p4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
}
