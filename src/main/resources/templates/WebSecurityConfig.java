package br.ifrn.aula.livraria.config;

import static org.junit.Assert.assertTrue;

import java.security.spec.EncodedKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.ifrn.aula.livraria.service.UserService;

/**
 * 
 * Essa classe serve para configurar o Spring Security
 * 
 * Essa @configuration serve para avisar ao spring Boot que essa classe é de
 * configuração;
 * 
 * @author Jeferson
 *
 */

@EnableWebSecurity
@ComponentScan(basePackageClasses = UserService.class)
@EnableGlobalMethodSecurity(securedEnabled=true,prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/resources/**", "/css/**", "/h2/**", "/admin", "/webjars/**").permitAll()
				.anyRequest().authenticated().and().formLogin().loginPage("/entrar").permitAll()
				.successForwardUrl("/layout").and().logout().permitAll()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/entrar");

		// Isso aqui é para poder permitir acesso ao h2.
		http.csrf().disable();
		http.headers().frameOptions().disable();

	}
	
	@Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean
	@Override
	 public AuthenticationManager authenticationManagerBean() throws Exception {
	      return super.authenticationManagerBean();
	}  

}
