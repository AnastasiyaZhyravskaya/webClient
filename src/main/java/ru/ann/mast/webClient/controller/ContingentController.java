package ru.ann.mast.webClient.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ru.ann.mast.webClient.model.Contingent;
import ru.ann.mast.webClient.service.ContingentService;

@Controller
public class ContingentController {

	@Autowired
	ContingentService contingentService;

	@RequestMapping(value = { "/contingentList" })
	public String viewPersonList(Model model) {
		model.addAttribute("contingent", contingentService.getAllContingents());
		return "contingentList";
	}
	
	@RequestMapping(value = { "/infoContingent" })
	public String addNewContingent(Model model) {
		Contingent contingent = Contingent.builder().build();
		model.addAttribute("contingent", contingent);
		return "infoContingent";
	}
	
	@RequestMapping(value = { "/saveContingent" })
	public String saveContingent(@ModelAttribute("contingent") Contingent contingent) {
		
		contingentService.saveContingent(contingent);
		
		return "redirect:/contingentList";
	}
	
	@RequestMapping(value = { "/updateContingent" })
	public String updateContingent(@RequestParam("contingentId") int id, Model model) {
		model.addAttribute("contingent", contingentService.getContingent(id));
		return "infoContingent";
	}
	
	@RequestMapping(value = { "/deleteContingent" })
	public String deleteContingent(@RequestParam("contingentId") int id) {
		contingentService.deleteContingent(id);
		return "redirect:/contingentList";
	}

}
