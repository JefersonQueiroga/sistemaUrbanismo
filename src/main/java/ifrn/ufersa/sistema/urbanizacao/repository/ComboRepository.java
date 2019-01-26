package ifrn.ufersa.sistema.urbanizacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ifrn.ufersa.sistema.urbanizacao.model.AtividadeComercial;
import ifrn.ufersa.sistema.urbanizacao.model.Coberta;
import ifrn.ufersa.sistema.urbanizacao.model.EdificacaoEtorno;
import ifrn.ufersa.sistema.urbanizacao.model.Elevacao;
import ifrn.ufersa.sistema.urbanizacao.model.Especie;
import ifrn.ufersa.sistema.urbanizacao.model.EstadoConservacao;
import ifrn.ufersa.sistema.urbanizacao.model.Imovel;
import ifrn.ufersa.sistema.urbanizacao.model.Padrao;
import ifrn.ufersa.sistema.urbanizacao.model.PadraoEdificacao;
import ifrn.ufersa.sistema.urbanizacao.model.PatrimonioConstrucao;
import ifrn.ufersa.sistema.urbanizacao.model.PatrimonioTerreno;
import ifrn.ufersa.sistema.urbanizacao.model.Pavimentacao;
import ifrn.ufersa.sistema.urbanizacao.model.Pedologia;
import ifrn.ufersa.sistema.urbanizacao.model.Piso;
import ifrn.ufersa.sistema.urbanizacao.model.PosicaoImovel;
import ifrn.ufersa.sistema.urbanizacao.model.RevestimentoParede;
import ifrn.ufersa.sistema.urbanizacao.model.SituacaoImovel;
import ifrn.ufersa.sistema.urbanizacao.model.TecnicaConstrutiva;
import ifrn.ufersa.sistema.urbanizacao.model.TipoImovel;
import ifrn.ufersa.sistema.urbanizacao.model.Topografia;
import ifrn.ufersa.sistema.urbanizacao.model.Tributos;
import ifrn.ufersa.sistema.urbanizacao.model.UsoSolo;

@Repository
public interface ComboRepository extends JpaRepository<Imovel,Long> {

	@Query("Select a From AtividadeComercial as a")
	List<AtividadeComercial> findAllAtividade();
	
	@Query("Select p From Pavimentacao as p")
	List<Pavimentacao> findAllPavimentacao();
	
	@Query("Select ti From TipoImovel as ti")
	List<TipoImovel> findAllTipoImovel();
	
	@Query("Select u From UsoSolo as u")
	List<UsoSolo> findAllUsoSolo();
	
	@Query("Select u From SituacaoImovel as u")
	List<SituacaoImovel> findAllSituacaoImovel();
	
	@Query("Select e From Especie as e")
	List<Especie> findAllEspecie();
	
	@Query("Select p From PatrimonioTerreno as p")
	List<PatrimonioTerreno> findAllPatrimonioTerreno();
	
	@Query("Select p From PosicaoImovel as p")
	List<PosicaoImovel> findAllPosicaoImovel();
	
	@Query("Select u From Tributos as u")
	List<Tributos> findAllTributos();
	
	@Query("Select u From Elevacao as u")
	List<Elevacao> findAllElevacao();
	
	@Query("Select u From Piso as u")
	List<Piso> findAllPiso();
	
	@Query("Select u From Coberta as u")
	List<Coberta> findAllCoberta();
	
	@Query("Select u From Padrao as u")
	List<Padrao> findAllPadrao();
	
	@Query("Select u From RevestimentoParede as u")
	List<RevestimentoParede> findAllRevestimentoParede();
	
	@Query("Select u From PatrimonioConstrucao as u")
	List<PatrimonioConstrucao> findAllPatrimonioConstrucao();
	
	@Query("Select u From EstadoConservacao as u")
	List<EstadoConservacao> findAllEstadoConservacao();
	
	@Query("Select u From TecnicaConstrutiva as u")
	List<TecnicaConstrutiva> findAllTecnicaConstrutiva();
	
	
	@Query("Select u From Pedologia as u")
	List<Pedologia> findAllPedologia();
	

	@Query("Select u From Topografia as u")
	List<Topografia> findAllTopografia();
	
	@Query("Select u From EdificacaoEtorno as u")
	List<EdificacaoEtorno> findAllEdificacaoEtorno();
	
	
	@Query("Select u From PadraoEdificacao as u")
	List<PadraoEdificacao> findAllPadraoEdificacao();
	
}
