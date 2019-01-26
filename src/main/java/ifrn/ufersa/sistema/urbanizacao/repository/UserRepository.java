package ifrn.ufersa.sistema.urbanizacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifrn.ufersa.sistema.urbanizacao.model.User;



@Repository
public interface UserRepository  extends JpaRepository<User,Long>{

	User findByUsername(String username);
	
}
