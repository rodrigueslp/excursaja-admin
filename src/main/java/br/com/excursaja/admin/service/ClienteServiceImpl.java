package br.com.excursaja.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.excursaja.admin.entity.Cliente;
import br.com.excursaja.admin.repository.ClienteRepo;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepo clienteRepo;
	
	@Override
	public List<Cliente> list() {
		return clienteRepo.list();
	}
	
}
