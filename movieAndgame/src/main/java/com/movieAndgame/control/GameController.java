package com.movieAndgame.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movieAndgame.DTO.GameMember;

@Controller
@RequestMapping("/game")
public class GameController {

	// localhost/game/index 매핑
	@GetMapping("/index")
	public String Home(Model model) {
		
		return "game/index";
	}
	
	@GetMapping("/login")
	public String loginHome(Model model) {
		model.addAttribute("gameMember", new GameMember());
		return "game/member/login";
	}
	
}
