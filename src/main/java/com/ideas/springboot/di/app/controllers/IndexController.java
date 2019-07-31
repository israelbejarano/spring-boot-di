package com.ideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ideas.springboot.di.app.models.service.IServicio;

/**
 * The Class IndexController.
 * @author Israel Bejarano
 */
@Controller
public class IndexController {
	
	/** The mi servicio. */
	@Autowired
	private IServicio miServicio;

	/**
	 * Index.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping({"/", "", "/index"})
	public String index(Model model) {
		model.addAttribute("objeto", miServicio.operacion());
		return "index";
	}
}