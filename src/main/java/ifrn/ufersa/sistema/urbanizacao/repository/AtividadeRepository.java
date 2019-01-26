package ifrn.ufersa.sistema.urbanizacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifrn.ufersa.sistema.urbanizacao.model.AtividadeComercial;

@Repository
public interface AtividadeRepository extends JpaRepository<AtividadeComercial,Long>{
		
	
}
