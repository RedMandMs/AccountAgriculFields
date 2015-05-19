package ru.lenoblgis.trenning.agrocultural.presentationTier.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.lenoblgis.trenning.agrocultural.buisnessTier.services.EventService;

@Controller
public class PassportsControllers {
	
	@RequestMapping(value = "/passports", method = RequestMethod.GET)
    public String printPassports(ModelMap model) {
		
		
		EventService passportService = new EventService();
		
        List<Map<String, String>> infoPassports = passportService.getAllEvents();
        model.addAttribute("infoPassports", infoPassports);
		
        return "passports";
	}

}
