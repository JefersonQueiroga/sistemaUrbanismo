package ifrn.ufersa.sistema.urbanizacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ifrn.ufersa.sistema.urbanizacao.model.Imovel;

@Component
public interface ImovelRepository extends JpaRepository<Imovel,Long>{

}
