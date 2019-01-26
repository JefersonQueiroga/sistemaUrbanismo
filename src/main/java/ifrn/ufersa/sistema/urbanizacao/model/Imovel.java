package ifrn.ufersa.sistema.urbanizacao.model;

import java.io.Serializable;
import ifrn.ufersa.sistema.urbanizacao.model.EstadoConservacao;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Jeferson
 *
 */
@Entity
public class Imovel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String descricao;

    private Integer qtdQuartos;
    private Integer qtdBanheiros;
    private Integer qtdSuites;
    private Integer qtdVaranda;
    private Integer qtdAreaServico;
    private Integer qtdGaragem;
    private Integer setor;
    private Integer quadra;
    private Integer novoSetor;
    private Integer novaQuadra;
    private Boolean alvara;
    private Boolean arborizacao;
    private Boolean iluminacao;
    private Boolean agua;
    private Boolean redeEnergia;
    private Boolean redeEsgoto;
    private Boolean fossaSeptica;
    private Boolean asfalto;
    private Boolean coletaLixo;
    private Boolean drenagem;
    
    public Imovel() {
   
	}
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_atividade", nullable = false)
    private AtividadeComercial atividade;
    

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pavimentacao", nullable = false)
    private Pavimentacao pavimentacao;
    
    @ManyToOne
    @JoinColumn(name = "id_coberta", nullable = false)
    private Coberta coberta;
    
    @ManyToOne
    @JoinColumn(name = "id_edificacao", nullable = false)
    private EdificacaoEtorno edificacaoEntorno;
    
    @ManyToOne
    @JoinColumn(name = "id_elevacao", nullable = false)
    private Elevacao elevacao;
    
    @ManyToOne
    @JoinColumn(name = "id_especie", nullable = false)
    private Especie especie;
    
    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private EstadoConservacao estadoConservacao;
    
    @ManyToOne
    @JoinColumn(name = "id_padrao", nullable = false)
    private Padrao padrao;
    
    @ManyToOne
    @JoinColumn(name = "id_padrao_edificacao", nullable = false)
    private PadraoEdificacao padraoEdificacao;
    
    @ManyToOne
    @JoinColumn(name = "id_patrimonio_cons", nullable = false)
    private PatrimonioConstrucao patrimonnioConstrucao;
    
    @ManyToOne
    @JoinColumn(name = "id_patrimonio_terreno", nullable = false)
    private PatrimonioTerreno patrimonioTerreno;
    
    @ManyToOne
    @JoinColumn(name = "id_pedologia", nullable = false)
    private Pedologia pedologia;
    
    @ManyToOne
    @JoinColumn(name = "id_piso", nullable = false)
    private Piso piso;
    
    @ManyToOne
    @JoinColumn(name = "id_posicao_imovel", nullable = false)
    private PosicaoImovel posicaoImovel;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_regime", nullable = false)
    private Regime regime;
    
    @ManyToOne
    @JoinColumn(name = "id_revestimento", nullable = false)
    private RevestimentoParede revestimentoParede;
    
       
    @ManyToOne
    @JoinColumn(name = "id_situacao_imovel", nullable = false)
    private SituacaoImovel situacaoImovel;
    
    @ManyToOne
    @JoinColumn(name = "id_tecnica_construtiva", nullable = false)
    private TecnicaConstrutiva tecnicaConstrutiva;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo_imovel", nullable = false)
    private TipoImovel tipoImovel;
    
    @ManyToOne
    @JoinColumn(name = "id_topografia", nullable = false)
    private Topografia topografia;
    
    @ManyToOne
    @JoinColumn(name = "id_tributo", nullable = false)
    private Tributos tributos;
    
    @ManyToOne
    @JoinColumn(name = "id_uso_solo", nullable = false)
    private UsoSolo usoSolo;
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQtdQuartos() {
		return qtdQuartos;
	}

	public void setQtdQuartos(Integer qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}

	public Integer getQtdBanheiros() {
		return qtdBanheiros;
	}

	public void setQtdBanheiros(Integer qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}

	public Integer getQtdSuites() {
		return qtdSuites;
	}

	public void setQtdSuites(Integer qtdSuites) {
		this.qtdSuites = qtdSuites;
	}

	public Integer getQtdVaranda() {
		return qtdVaranda;
	}

	public void setQtdVaranda(Integer qtdVaranda) {
		this.qtdVaranda = qtdVaranda;
	}

	public Integer getQtdAreaServico() {
		return qtdAreaServico;
	}

	public void setQtdAreaServico(Integer qtdAreaServico) {
		this.qtdAreaServico = qtdAreaServico;
	}

	public Integer getQtdGaragem() {
		return qtdGaragem;
	}

	public void setQtdGaragem(Integer qtdGaragem) {
		this.qtdGaragem = qtdGaragem;
	}

	public Integer getSetor() {
		return setor;
	}

	public void setSetor(Integer setor) {
		this.setor = setor;
	}

	public Integer getQuadra() {
		return quadra;
	}

	public void setQuadra(Integer quadra) {
		this.quadra = quadra;
	}

	public Integer getNovoSetor() {
		return novoSetor;
	}

	public void setNovoSetor(Integer novoSetor) {
		this.novoSetor = novoSetor;
	}

	public Integer getNovaQuadra() {
		return novaQuadra;
	}

	public void setNovaQuadra(Integer novaQuadra) {
		this.novaQuadra = novaQuadra;
	}

	public Boolean getAlvara() {
		return alvara;
	}

	public void setAlvara(Boolean alvara) {
		this.alvara = alvara;
	}

	public AtividadeComercial getAtividade() {
		return atividade;
	}

	public void setAtividade(AtividadeComercial atividade) {
		this.atividade = atividade;
	}

	public Pavimentacao getPavimentacao() {
		return pavimentacao;
	}

	public void setPavimentacao(Pavimentacao pavimentacao) {
		this.pavimentacao = pavimentacao;
	}

	public Coberta getCoberta() {
		return coberta;
	}

	public void setCoberta(Coberta coberta) {
		this.coberta = coberta;
	}

	public EdificacaoEtorno getEdificacaoEntorno() {
		return edificacaoEntorno;
	}

	public void setEdificacaoEntorno(EdificacaoEtorno edificacaoEntorno) {
		this.edificacaoEntorno = edificacaoEntorno;
	}

	public Elevacao getElevacao() {
		return elevacao;
	}

	public void setElevacao(Elevacao elevacao) {
		this.elevacao = elevacao;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public EstadoConservacao getEstadoConservacao() {
		return estadoConservacao;
	}

	public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}

	public Padrao getPadrao() {
		return padrao;
	}

	public void setPadrao(Padrao padrao) {
		this.padrao = padrao;
	}

	public PadraoEdificacao getPadraoEdificacao() {
		return padraoEdificacao;
	}

	public void setPadraoEdificacao(PadraoEdificacao padraoEdificacao) {
		this.padraoEdificacao = padraoEdificacao;
	}

	public PatrimonioConstrucao getPatrimonnioConstrucao() {
		return patrimonnioConstrucao;
	}

	public void setPatrimonnioConstrucao(PatrimonioConstrucao patrimonnioConstrucao) {
		this.patrimonnioConstrucao = patrimonnioConstrucao;
	}

	public PatrimonioTerreno getPatrimonioTerreno() {
		return patrimonioTerreno;
	}

	public void setPatrimonioTerreno(PatrimonioTerreno patrimonioTerreno) {
		this.patrimonioTerreno = patrimonioTerreno;
	}

	public Pedologia getPedologia() {
		return pedologia;
	}

	public void setPedologia(Pedologia pedologia) {
		this.pedologia = pedologia;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public PosicaoImovel getPosicaoImovel() {
		return posicaoImovel;
	}

	public void setPosicaoImovel(PosicaoImovel posicaoImovel) {
		this.posicaoImovel = posicaoImovel;
	}

	public Regime getRegime() {
		return regime;
	}

	public void setRegime(Regime regime) {
		this.regime = regime;
	}

	public RevestimentoParede getRevestimentoParede() {
		return revestimentoParede;
	}

	public void setRevestimentoParede(RevestimentoParede revestimentoParede) {
		this.revestimentoParede = revestimentoParede;
	}

	public SituacaoImovel getSituacaoImovel() {
		return situacaoImovel;
	}

	public void setSituacaoImovel(SituacaoImovel situacaoImovel) {
		this.situacaoImovel = situacaoImovel;
	}

	public TecnicaConstrutiva getTecnicaConstrutiva() {
		return tecnicaConstrutiva;
	}

	public void setTecnicaConstrutiva(TecnicaConstrutiva tecnicaConstrutiva) {
		this.tecnicaConstrutiva = tecnicaConstrutiva;
	}

	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public Topografia getTopografia() {
		return topografia;
	}

	public void setTopografia(Topografia topografia) {
		this.topografia = topografia;
	}

	public Tributos getTributos() {
		return tributos;
	}

	public void setTributos(Tributos tributos) {
		this.tributos = tributos;
	}

	public UsoSolo getUsoSolo() {
		return usoSolo;
	}

	public void setUsoSolo(UsoSolo usoSolo) {
		this.usoSolo = usoSolo;
	}

	public Boolean getArborizacao() {
		return arborizacao;
	}

	public void setArborizacao(Boolean arborizacao) {
		this.arborizacao = arborizacao;
	}

	public Boolean getIluminacao() {
		return iluminacao;
	}

	public void setIluminacao(Boolean iluminacao) {
		this.iluminacao = iluminacao;
	}

	public Boolean getAgua() {
		return agua;
	}

	public void setAgua(Boolean agua) {
		this.agua = agua;
	}

	public Boolean getRedeEnergia() {
		return redeEnergia;
	}

	public void setRedeEnergia(Boolean redeEnergia) {
		this.redeEnergia = redeEnergia;
	}

	public Boolean getRedeEsgoto() {
		return redeEsgoto;
	}

	public void setRedeEsgoto(Boolean redeEsgoto) {
		this.redeEsgoto = redeEsgoto;
	}

	public Boolean getFossaSeptica() {
		return fossaSeptica;
	}

	public void setFossaSeptica(Boolean fossaSeptica) {
		this.fossaSeptica = fossaSeptica;
	}

	public Boolean getAsfalto() {
		return asfalto;
	}

	public void setAsfalto(Boolean asfalto) {
		this.asfalto = asfalto;
	}

	public Boolean getColetaLixo() {
		return coletaLixo;
	}

	public void setColetaLixo(Boolean coletaLixo) {
		this.coletaLixo = coletaLixo;
	}

	public Boolean getDrenagem() {
		return drenagem;
	}

	public void setDrenagem(Boolean drenagem) {
		this.drenagem = drenagem;
	}
	
	
    
    

}
