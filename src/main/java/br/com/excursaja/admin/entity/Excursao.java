package br.com.excursaja.admin.entity;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "excursao")
public class Excursao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private BigDecimal valor;
	
	private String descricao;
	
	private String observacao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_evento")
	private Calendar dataEvento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_partida")
	private Calendar dataPartida;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_retorno")
	private Calendar dataRetorno;
	
	@ManyToOne
	private Empresa empresa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Calendar getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Calendar dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Calendar getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(Calendar dataPartida) {
		this.dataPartida = dataPartida;
	}

	public Calendar getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Calendar dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	

}
