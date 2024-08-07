package com.example.bookTest.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.DTO.BankDto;
import com.example.bookTest.DTO.BookDto;
import com.example.bookTest.DTO.InfoDto;

@Controller
public class HomeController {
	
	// 요청 주소와 메서드를 매핑(연관) 시켜준다.
	@GetMapping("/home")
	public String homeView() {  // 뷰 페이지만 제공하는 경우에는 페이지 이름만 넘긴다.
		return "home";
	}
	
	@GetMapping("/infoInput")
	public ModelAndView info(@ModelAttribute InfoDto infoDto) {
		System.out.println(infoDto.getUName());
		// ModelAndView : 사용자에게 제공할 페이지와 데이터를 저장할 수 있는 클래스
		// 사용자에게 제공할 페이지는 객체 생성시 입력하거나 setViewName 메서드로 입력하면 된다.
		ModelAndView mv = new ModelAndView("info");
	//	mv.setViewName("info");  메서드로 제공 페이지 입력
		
		String byear = infoDto.getUBirth().substring(0, 4);
		int age = 2024 - Integer.parseInt(byear);
		mv.addObject("ageData", age);  // 뷰 페이지에 전달할 데이터 설정
		return mv;
	}
	
	
	@GetMapping("/write")
	public String bookWrite() {
		return "bookWrite";
	}
	
	@GetMapping("/detail")
	public ModelAndView write(@ModelAttribute BookDto bookDto) {
		ModelAndView bmv = new ModelAndView("bookDetail");
		bmv.addObject("data", bookDto);
		return bmv;
	}
	
	
	@GetMapping("/input")
	public String bank() {
		return "bank";
	}
	
	@PostMapping("/result")
	public ModelAndView result(@ModelAttribute BankDto bankDto) {
		ModelAndView bnmv = new ModelAndView("result");
		bnmv.addObject("bank", bankDto);
		return bnmv;
	}

}
