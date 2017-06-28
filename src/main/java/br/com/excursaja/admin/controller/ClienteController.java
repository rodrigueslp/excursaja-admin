package br.com.excursaja.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.excursaja.admin.entity.Cliente;
import br.com.excursaja.admin.service.ClienteService;

@RestController
@RequestMapping(value="/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value="/listar", produces = "application/json")
	@ResponseBody
	public List<Cliente> list() {
		return clienteService.list();
	}
	
}
