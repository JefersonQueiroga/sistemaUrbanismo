
package ifrn.ufersa.sistema.urbanizacao.urbanizacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"ifrn.ufersa.sistema.urbanizacao.controller","ifrn.ufersa.sistema.urbanizacao.service",
		"ifrn.ufersa.sistema.urbanizacao.conf"})
@EntityScan("ifrn.ufersa.sistema.urbanizacao.model")
@EnableJpaRepositories("ifrn.ufersa.sistema.urbanizacao.repository")
public class UrbanizacaoApplication {
	public static void main(String[] args) {
		SpringApplication.run(UrbanizacaoApplication.class, args);
	} 
}
