package ru.ann.mast.webClient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value = { "/", "/index", "/home" })
	public String index(Model model) {
		String message = "Выберите интересующий раздел:";
		model.addAttribute("message", message);
		return "index";
	}
}
