package ifrn.ufersa.sistema.urbanizacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ifrn.ufersa.sistema.urbanizacao.model.Imovel;
import ifrn.ufersa.sistema.urbanizacao.model.Regime;
import ifrn.ufersa.sistema.urbanizacao.repository.ImovelRepository;
import ifrn.ufersa.sistema.urbanizacao.repository.RegimeRepository;


@Service
public class ImovelService {

    @Autowired
    private ImovelRepository repository;
    
    @Autowired
    private RegimeRepository regimeRepository;
    
	public  List<Imovel> findAll() {
		return repository.findAll();
	}
	
	public Imovel findOne(Long id) {
        return repository.getOne(id);
    }
     
	public Imovel save(Imovel imovel) {
        return repository.saveAndFlush(imovel);
    }
     
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
    public  List<Regime> findAllRegime() {
		return regimeRepository.findAll();
	}
	

}
