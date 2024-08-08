package com.example.bookTest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.DTO.CoffeeDto;
import com.example.bookTest.service.CoffeeService;

@Controller
public class CoffeeController {

	@Autowired
	private CoffeeService coffeeService;
	
	@GetMapping("/coffee")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("coffee/index");
		List<CoffeeDto> list = coffeeService.selectAll();
		mv.addObject("list", list);
		return mv;
	}
	
	@GetMapping("/coffeeReg")
	public ModelAndView write() {
		ModelAndView mv = new ModelAndView("coffee/coffeeForm");
		return mv;
	}
	
	@PostMapping("/coffeeSave")
	public String click(@ModelAttribute CoffeeDto coffeeDto) {
		coffeeService.coffeeSave(coffeeDto);
		return "redirect:/coffee";
	}
	
}
