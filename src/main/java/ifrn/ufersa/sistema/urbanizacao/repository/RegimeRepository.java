package ifrn.ufersa.sistema.urbanizacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import ifrn.ufersa.sistema.urbanizacao.model.Regime;

@Component
public interface RegimeRepository extends JpaRepository<Regime,Long>{

}
