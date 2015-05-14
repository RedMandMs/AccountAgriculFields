package ru.lenoblgis.trenning.agrocultural.presentationTier.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoodbuyController {
	
	@RequestMapping(value = "/goodbuy", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "GoodBuy!!!");
        return "welcome";
	}
}
