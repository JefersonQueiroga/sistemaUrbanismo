package ifrn.ufersa.sistema.urbanizacao.conf;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/*
 * Testando
 */
public class Teste {
	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String teste = bCryptPasswordEncoder.encode("123");
		System.out.println(teste);
	}
}
