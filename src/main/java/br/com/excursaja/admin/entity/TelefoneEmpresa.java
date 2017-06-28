package br.com.excursaja.admin.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.excursaja.admin.enums.TelefoneTipo;

@Entity
@Table(name = "telefone_empresa")
public class TelefoneEmpresa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String numero;
	
	@Enumerated(EnumType.STRING)
	private TelefoneTipo tipo;
	
	@ManyToOne
	private Empresa empresa;
	
}
