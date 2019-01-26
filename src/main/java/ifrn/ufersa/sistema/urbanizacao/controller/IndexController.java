package ifrn.ufersa.sistema.urbanizacao.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ifrn.ufersa.sistema.urbanizacao.model.User;



@Controller
public class IndexController {
	
		
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/teste")
	public String teste() {
		return "index";
	}
	
	

	@RequestMapping("/login")
	public String login(@AuthenticationPrincipal User user) {
	    if(user != null) {
	    	return "redirect:/index";
	    }
	    return "redirect:/entrar";
	}
	
	
	@RequestMapping(method=RequestMethod.POST,path= {"/index"})
	public String login() {
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.GET,path= {"/entrar"})
	public String entrar() {
		return "login";
	}
	

	
}
