package com.ideas.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

/**
 * The Class MiServicio.
 * @author Israel Bejarano
 */
@Service("miServicio")
public class MiServicio implements IServicio{
	
	/**
	 * Operacion.
	 *
	 * @return the string
	 */
	@Override
	public String operacion() {
		return "ejecutando algún proceso importante...";
	}
}