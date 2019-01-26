package ifrn.ufersa.sistema.urbanizacao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ifrn.ufersa.sistema.urbanizacao.model.Imovel;
import ifrn.ufersa.sistema.urbanizacao.service.ComboService;
import ifrn.ufersa.sistema.urbanizacao.service.ImovelService;

@Controller
@RequestMapping("/imovel")
public class ImovelController {
	
	@Autowired
	private ImovelService service;
	
	@Autowired
	private ComboService comboService;
    
	@GetMapping("/lista")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView("imovel/lista");
		mv.addObject("imoveis", service.findAll());
        return mv;
	}
	
	@GetMapping("/edit/{id}")
	private ModelAndView edit( @PathVariable("id") Long id) {
		
		System.out.println("id:" + id);
		Imovel imovel = service.findOne(id);
				
		return preCadastro(imovel);
	}
	


	@GetMapping("/delete/{id}")
	private ModelAndView delete( @PathVariable("id") Long id) {
		service.delete(id);
		return findAll();
	}
	
	@PostMapping("/save")
    public ModelAndView save(@Valid Imovel imovel, BindingResult result) {
         
        if(result.hasErrors()) {
            return preCadastro(imovel);
        }
        
        service.save(imovel);
         
        return findAll();
    }
	
	@RequestMapping("/add")
	public ModelAndView preCadastro(Imovel imovel) {
		ModelAndView mv = new ModelAndView("imovel/form");
		mv.addObject("imovel", imovel);
		mv.addObject("regimes", service.findAllRegime());
		mv.addObject("atividades",comboService.findAllAtividade());
		mv.addObject("usoSolos",comboService.findAllUsoSolo());
		mv.addObject("pavimentacoes",comboService.findAllAtividade());
		mv.addObject("tipoImoveis",comboService.findAllTipoImovel());
		mv.addObject("situacaoImoveis", comboService.findAllSituacaoImovel());
		mv.addObject("especies",comboService.findAllEspecies());
		mv.addObject("patrimonioTerrenos",comboService.findAllPatrimonioTerrenos());
		mv.addObject("posicaoImoveis",comboService.findAllPosicaoImoveis());
		mv.addObject("tributos",comboService.findAllTributos());
		mv.addObject("elevacoes",comboService.findAllElevacoes());
		mv.addObject("pisos",comboService.findAllPisos());
		mv.addObject("cobertas",comboService.findAllCobertas());
		mv.addObject("padroes",comboService.findAllPadroes());
		mv.addObject("revestimentoParedes",comboService.findAllRevestimentoParedes());
		mv.addObject("patrimonioConstrucoes",comboService.findAllPatrimonioConstrucoes());
		mv.addObject("estadoConservacoes",comboService.findAllEstadoConservacoes());
		mv.addObject("tecnicaConstrutivas",comboService.findAllTecnicaConstrutivas());
		mv.addObject("pedologias",comboService.findAllPedologias());
		mv.addObject("topografias",comboService.findAllTopografias());
		mv.addObject("edificacaoEntornos",comboService.findAllEdificacaoEntornos());
		mv.addObject("padraoEdificacao",comboService.findAllPadraoEdificacao());
		
		
		mv.addObject("tipoImoveis",comboService.findAllTipoImovel());
		
		
		return mv;
	}
	
	
}
