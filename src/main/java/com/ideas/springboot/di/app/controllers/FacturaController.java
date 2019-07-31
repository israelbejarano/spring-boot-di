package com.ideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ideas.springboot.di.app.models.domain.Factura;

/**
 * The Class FacturaController.
 * @author Israel Bejarano
 */
@Controller
@RequestMapping("/factura")
public class FacturaController {

	/** The factura. */
	@Autowired
	private Factura factura;
	
	/**
	 * Ver.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/ver")
	public String ver(Model model) {
		model.addAttribute("factura", factura);
		model.addAttribute("titulo", "Ejemplo factura con inyeccion de dependencia");
		return "factura/ver";
	}
}