package ifrn.ufersa.sistema.urbanizacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifrn.ufersa.sistema.urbanizacao.model.Role;
import ifrn.ufersa.sistema.urbanizacao.repository.RoleRepository;



@Service
public class RoleService {
	@Autowired
	private RoleRepository repository;
	
	public List<Role> buscarTodos(){
		return repository.findAll();
	}
}
