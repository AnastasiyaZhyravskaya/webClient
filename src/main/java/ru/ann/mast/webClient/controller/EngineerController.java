package ru.ann.mast.webClient.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ru.ann.mast.webClient.model.Contingent;
import ru.ann.mast.webClient.model.Engineer;
import ru.ann.mast.webClient.model.Region;
import ru.ann.mast.webClient.service.ContingentService;
import ru.ann.mast.webClient.service.EngineerService;
import ru.ann.mast.webClient.service.RegionService;

@Controller
public class EngineerController {

	@Autowired
	EngineerService engineerService;
	@Autowired
	RegionService regionService;
	@Autowired
	ContingentService contingentService;

	@RequestMapping(value = { "/engineerList" })
	public String viewPersonList(Model model) {
		model.addAttribute("engineer", engineerService.getAllEngineers());
		return "engineerList";
	}
	
	@RequestMapping(value = { "/infoEngineer" })
	public String addNewEngineer(Model model) {
		Engineer engineer = Engineer.builder().build();
		model.addAttribute("engineer", engineer);
		
		model.addAttribute("region", regionService.getAllRegions());
		model.addAttribute("contingent", contingentService.getAllContingents());
		
		return "infoEngineer";
	}
	
	
	
	@RequestMapping(value = { "/saveEngineer" })
	public String saveEngineer(@ModelAttribute("engineer") Engineer engineer) {
		System.out.println(engineer);
		engineerService.saveEngineer(engineer);
		
		return "redirect:/engineerList";
	}
	
	@RequestMapping(value = { "/updateEngineer" })
	public String updateEngineer(@RequestParam("engineerId") int id, Model model) {
		model.addAttribute("engineer", engineerService.getEngineer(id));
		return "infoEngineer";
	}
	
	@RequestMapping(value = { "/deleteEngineer" })
	public String deleteEngineer(@RequestParam("engineerId") int id) {
		engineerService.deleteEngineer(id);
		return "redirect:/engineerList";
	}

}
