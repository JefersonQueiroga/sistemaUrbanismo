package ifrn.ufersa.sistema.urbanizacao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.ufersa.sistema.urbanizacao.model.User;
import ifrn.ufersa.sistema.urbanizacao.service.RoleService;
import ifrn.ufersa.sistema.urbanizacao.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserService userService;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@RequestMapping("/add")
	public ModelAndView add(User user) {
		ModelAndView mv = new ModelAndView("usuario/form");
		mv.addObject("roles", roleService.buscarTodos());
		mv.addObject("user", user);
		return mv;
	}
	
	@GetMapping("/edit/{id}")
	private ModelAndView edit( @PathVariable("id") Long id) {
		User user = (User) userService.findByID(id);
		return add(user);
	}

	@PostMapping("/save")
	public ModelAndView save(@Valid User user, BindingResult result) {

		if (result.hasErrors()) {
			return add(user);
		}

		//Condificando a senha
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));
		userService.salvar(user);

		return findAll();
	}

	@GetMapping("/lista")
	private ModelAndView findAll() {
		ModelAndView mv = new ModelAndView("usuario/lista");
		mv.addObject("usuarios", userService.findAll());
		return mv;
	}

}
