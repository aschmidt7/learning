package com.chicho.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chicho.learn.model.Persona;
import com.chicho.learn.repo.IPersonaRepo;

@Controller
public class DemoConroller {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Persona p = new Persona();
		p.setIdPersona(2);
		p.setNombre("Code");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String listar(Model model){
		
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}

}
