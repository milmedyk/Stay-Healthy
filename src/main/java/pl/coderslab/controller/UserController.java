package pl.coderslab.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.dao.UserDao;
import pl.coderslab.entity.User;

import pl.coderslab.repository.UserRepository;

@Controller
@Transactional
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/trening")
	public String del2() {

		return "Trening";
	}

	@GetMapping("/dieta")
	public String del() {

		return "dietaList";
	}

	@GetMapping("/products")
	public String del1() {

		return "productsList";
	}

	@GetMapping("/create")
	public String form() {
		return "userForm";

	}

	@PostMapping("/create")
	public String formPost(@RequestParam String login, @RequestParam String password, @RequestParam String email) {
		while (true) {
			User user = new User();
			user.setLogin(login);
			user.setPassword(password);
			user.setEmail(email);

			if ((this.userRepository.findByLogin(login) != null) || (this.userRepository.findByEmail(email) != null)) {

				return "redirect:/userRepo/all";
			}

			else {
				this.userDao.save(user);
				return "redirect:/userRepo/all";

			}

		}

	}

	@GetMapping("/{id}/del")
	public String del(@PathVariable long id) {
		User user = this.userDao.findById(id);
		this.userDao.delete(user);
		return "redirect:/userRepo/all";
	}

	@GetMapping("/listJsp")
	public String listJsp() {
		return "userList";
	}

}