package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.service.Service;



@Controller
public class Controllore {
	
	@RequestMapping(value  = "/action")
	public ModelAndView operation(@RequestParam("operazione") String operazione, Model model) {
		
		ModelAndView newModel = new ModelAndView("numeri");
		newModel.addObject("operazione", operazione);
		return newModel;
		
	}
	
	@RequestMapping(value  = "/calcolatore")
	public ModelAndView calcolo(@RequestParam("operazione") String operazione, @RequestParam("numero1") long numero1 ,@RequestParam("numero2") long numero2, Model model) {
		
		Service s = new Service();
		ModelAndView mod = new ModelAndView("risultato");
		
		
		if(operazione.equals("add")) {
			mod.addObject("ris", s.add(numero1, numero2));
		}
		if(operazione.equals("molt")) {
			mod.addObject("ris", s.molt(numero1, numero2));
		}
		if(operazione.equals("div")) {
			if(s.check(numero2)) {
			mod.addObject("ris", s.div(numero1, numero2));
		}else {
			mod.addObject("mess", "non puoi dividere per 0, Capra!");
		}
		}
		if(operazione.equals("sott")) {
			mod.addObject("ris", s.sott(numero1, numero2));
		}
		
		
		return mod;
			
	}
	
}
