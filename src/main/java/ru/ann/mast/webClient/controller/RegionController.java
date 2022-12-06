package ru.ann.mast.webClient.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ru.ann.mast.webClient.model.Region;
import ru.ann.mast.webClient.service.RegionService;

@Controller
public class RegionController {

	@Autowired
	RegionService regionService;

	@RequestMapping(value = { "/regionList" })
	public String viewPersonList(Model model) {
		model.addAttribute("region", regionService.getAllRegions());
		return "regionList";
	}
	
	@RequestMapping(value = { "/infoRegion" })
	public String addNewRegion(Model model) {
		Region region = Region.builder().build();
		model.addAttribute("region", region);
		return "infoRegion";
	}
	
	@RequestMapping(value = { "/saveRegion" })
	public String saveRegion(@ModelAttribute("region") Region region) {
		
		regionService.saveRegion(region);
		
		return "redirect:/regionList";
	}
	
	@RequestMapping(value = { "/updateRegion" })
	public String updateRegion(@RequestParam("regionId") int id, Model model) {
		model.addAttribute("region", regionService.getRegion(id));
		return "infoRegion";
	}
	
	@RequestMapping(value = { "/deleteRegion" })
	public String deleteRegion(@RequestParam("regionId") int id) {
		regionService.deleteRegion(id);
		return "redirect:/regionList";
	}

}
