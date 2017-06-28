package br.com.excursaja.admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nomeFantasia;
	
	private String razaoSocial;
	
	private String cpfCnpj;
	
	private String endereco;
		
	private String email;
	
	@ManyToOne
	private Cidade cidade;
	
	
}
