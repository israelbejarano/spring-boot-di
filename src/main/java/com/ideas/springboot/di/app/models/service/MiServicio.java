package com.ideas.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

@Service("miServicio")
public class MiServicio implements IServicio{
	
	
	@Override
	public String operacion() {
		return "ejecutando algún proceso importante...";
	}

}
