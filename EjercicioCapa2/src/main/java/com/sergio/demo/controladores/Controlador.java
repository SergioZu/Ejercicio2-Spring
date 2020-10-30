package com.sergio.demo.controladores;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.sergio.demo.negocio.INegocio;
@Controller
public class Controlador {
	
	@Autowired
	INegocio iNegocio;
	
	@RequestMapping("Masa")
	
	public String calcularCohe(@RequestParam("nombre") String n,ModelMap model) throws IOException {
		
		iNegocio.RecogerDatos(n);
		Double masacorporalDouble=iNegocio.comprobarIMC();
		model.addAttribute("d", masacorporalDouble);
		
		return "Masa";
		
		
		
		
	}
}
