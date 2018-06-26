package pl.coderslab.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.entity.Product;
import pl.coderslab.model.UserDTO;

@Controller
@RequestMapping("/userDetail")
public class PersonDetailController {
	@GetMapping("/form")
	public String formTaglib(Model m) {
		m.addAttribute("userDto", new UserDTO());

		return "userDtoForm";
	}
	
	@PostMapping("/form")
	@ResponseBody
	public String formTaglibPost(@ModelAttribute UserDTO userDto) {
		return "redirect:/product/all";
	}
	
	
}