package com.salesianostriana.dam.proyectoconramas.controladores;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

		@GetMapping("/")
		public String sayHello(Model model) {
			model.addAttribute("mensaje", "Hola mundo, que pasa chavales");
			return "index";
		}
	
}
