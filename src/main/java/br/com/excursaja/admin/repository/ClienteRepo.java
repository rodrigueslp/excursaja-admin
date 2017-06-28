package br.com.excursaja.admin.repository;

import java.util.List;

import br.com.excursaja.admin.entity.Cliente;

public interface ClienteRepo {

	public List<Cliente> list();
	public void delete(Cliente cliente);
	public void update(Cliente cliente);
	public void save(Cliente cliente);
	public Cliente get(int id);
	
}
