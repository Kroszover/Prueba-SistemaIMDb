package cl.desafiolatam.controller;

import java.security.Principal;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.desafiolatam.model.User;


@Controller
public class UserController {



	

	@RequestMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model,
			@Valid @ModelAttribute("user") User user, BindingResult result) {
		if (error != null) {
			model.addAttribute("errorMessage", "Error en sus credenciales de inicio. Favor intentar neuvamente");
		}

		if (logout != null) {
			model.addAttribute("logoutMessage", "Ha salido con Exito!");
		}

		return "login";
	}
	
	@GetMapping("/registration")
	public String registerForm(@Valid @ModelAttribute("user") User user) {
		return "registration";
	}
	
	
	@RequestMapping(value = { "/", "/home"})
	public String home(Principal principal) {
		return "redirect:/shows";
	}

}