package ifrn.ufersa.sistema.urbanizacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifrn.ufersa.sistema.urbanizacao.model.AtividadeComercial;
import ifrn.ufersa.sistema.urbanizacao.model.Coberta;
import ifrn.ufersa.sistema.urbanizacao.model.EdificacaoEtorno;
import ifrn.ufersa.sistema.urbanizacao.model.Elevacao;
import ifrn.ufersa.sistema.urbanizacao.model.Especie;
import ifrn.ufersa.sistema.urbanizacao.model.EstadoConservacao;
import ifrn.ufersa.sistema.urbanizacao.model.Padrao;
import ifrn.ufersa.sistema.urbanizacao.model.PadraoEdificacao;
import ifrn.ufersa.sistema.urbanizacao.model.PatrimonioConstrucao;
import ifrn.ufersa.sistema.urbanizacao.model.PatrimonioTerreno;
import ifrn.ufersa.sistema.urbanizacao.model.Pavimentacao;
import ifrn.ufersa.sistema.urbanizacao.model.Pedologia;
import ifrn.ufersa.sistema.urbanizacao.model.Piso;
import ifrn.ufersa.sistema.urbanizacao.model.PosicaoImovel;
import ifrn.ufersa.sistema.urbanizacao.model.Regime;
import ifrn.ufersa.sistema.urbanizacao.model.RevestimentoParede;
import ifrn.ufersa.sistema.urbanizacao.model.SituacaoImovel;
import ifrn.ufersa.sistema.urbanizacao.model.TecnicaConstrutiva;
import ifrn.ufersa.sistema.urbanizacao.model.TipoImovel;
import ifrn.ufersa.sistema.urbanizacao.model.Topografia;
import ifrn.ufersa.sistema.urbanizacao.model.Tributos;
import ifrn.ufersa.sistema.urbanizacao.model.UsoSolo;
import ifrn.ufersa.sistema.urbanizacao.repository.ComboRepository;
import ifrn.ufersa.sistema.urbanizacao.repository.RegimeRepository;

@Service
public class ComboService {
	
	
	@Autowired
    private RegimeRepository regimeRepository;
	
	@Autowired
    private ComboRepository comboRepository;
	
	
	public  List<Regime> findAllRegime() {
		return regimeRepository.findAll();
	}
	
	public  List<AtividadeComercial> findAllAtividade() {
		return comboRepository.findAllAtividade();
	}
	
	public  List<TipoImovel> findAllTipoImovel() {
		return comboRepository.findAllTipoImovel();
	}
	
	public  List<UsoSolo> findAllUsoSolo(){
		return comboRepository.findAllUsoSolo();
	}
	
	public  List<Pavimentacao> findAllPavimentacao(){
		return comboRepository.findAllPavimentacao();
	}
	
	public  List<SituacaoImovel> findAllSituacaoImovel(){
		return comboRepository.findAllSituacaoImovel();
	}

	public List<Especie> findAllEspecies() {
		return comboRepository.findAllEspecie();
	}

	public List<PatrimonioTerreno> findAllPatrimonioTerrenos() {
		return comboRepository.findAllPatrimonioTerreno();
	}

	public List<PosicaoImovel>  findAllPosicaoImoveis() {
		return comboRepository.findAllPosicaoImovel();
	}

	public List<Tributos>  findAllTributos() {
		return comboRepository.findAllTributos();
	}

	public List<Elevacao> findAllElevacoes() {
		return comboRepository.findAllElevacao();
	}

	public List<Piso> findAllPisos() {
		return comboRepository.findAllPiso();
	}

	public List<Coberta> findAllCobertas() {
		return comboRepository.findAllCoberta();
	}

	public List<Padrao> findAllPadroes() {
		return comboRepository.findAllPadrao();
	}

	public List<RevestimentoParede> findAllRevestimentoParedes() {
		return comboRepository.findAllRevestimentoParede();
	}

	public List<PatrimonioConstrucao> findAllPatrimonioConstrucoes() {
		return comboRepository.findAllPatrimonioConstrucao();
	}

	public List<EstadoConservacao> findAllEstadoConservacoes() {
		return comboRepository.findAllEstadoConservacao();
	}

	public List<TecnicaConstrutiva> findAllTecnicaConstrutivas() {
		return comboRepository.findAllTecnicaConstrutiva();
	}

	public List<Pedologia> findAllPedologias() {
		return comboRepository.findAllPedologia();
	}

	public List<Topografia> findAllTopografias() {
		return comboRepository.findAllTopografia();
	}

	public List<EdificacaoEtorno> findAllEdificacaoEntornos() {
		return comboRepository.findAllEdificacaoEtorno();
	}

	public List<PadraoEdificacao> findAllPadraoEdificacao() {
		return comboRepository.findAllPadraoEdificacao();
	}
	
	
}
