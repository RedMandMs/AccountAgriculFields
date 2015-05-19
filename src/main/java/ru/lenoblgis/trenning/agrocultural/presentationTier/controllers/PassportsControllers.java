package ru.lenoblgis.trenning.agrocultural.presentationTier.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PassportsControllers {
	
	@RequestMapping(value = "/passports", method = RequestMethod.GET)
    public String printPassports(ModelMap model) {
		
		
		/*EventService passportService = new EventService();
		
        List<Map<String, String>> infoPassports = passportService.getAllEvents();
        model.addAttribute("infoPassports", infoPassports);*/
		
        return "passports";
	}

}
