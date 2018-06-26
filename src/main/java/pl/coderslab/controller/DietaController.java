package pl.coderslab.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.entity.User;
@Controller
@Transactional
@RequestMapping("/dieta")
public class DietaController {
	@GetMapping("/post")
	public String del() {
		
		return "dietaList";
	}
}
