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

import pl.coderslab.dao.ProductDao;
import pl.coderslab.dao.UserDao;
import pl.coderslab.entity.Product;
import pl.coderslab.entity.User;
import pl.coderslab.repository.ProductRepository;
import pl.coderslab.repository.UserRepository;

@Controller
@Transactional
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductDao productDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/create")
	public String form() {
		return "productForm";
	}

	@PostMapping("/create")
	public String formPost(@RequestParam String name, @RequestParam String bialko, @RequestParam String calories,
			@RequestParam String tluszcze, @RequestParam String weglowodane, @RequestParam String login,
			@RequestParam String password) {

		Product product = new Product();
		product.setName(name);
		product.setBialko(bialko);
		product.setCalories(calories);
		product.setTluszcze(tluszcze);
		product.setWeglowodane(weglowodane);
		product.setLogin(login);
		product.setPassword(password);
		while(true) {
		if (this.userRepository.findByLogin(login) == null) {
//		if ((product.getLogin().equals(this.userRepository.findByLogin(login)))|| (product.getPassword().equals(this.userRepository.findByPassword(password)))) {
			

		
			return "redirect:/product/all";
		}

		else {
			this.productDao.save(product);
			return "redirect:/product/all";
		}
		}

	}

	@GetMapping("/all")
	public String showAll(Model model) {
		List<Product> product = this.productRepository.findAll();
		model.addAttribute("product", product);
		return "productList";
	}

	@GetMapping("/{id}/del")
	public String del(@PathVariable long id) {
		Product product = this.productDao.findById(id);
		this.productDao.delete(product);
		return "redirect:/product/all";
	}

	@GetMapping("/{id}/edit")
	public String edit(@PathVariable long id, Model model) {
		Product product = this.productDao.findById(id);
		model.addAttribute("product", product);
		return "addProductForm";
		

	}
}