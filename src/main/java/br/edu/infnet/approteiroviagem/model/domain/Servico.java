package br.edu.infnet.approteiroviagem.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_servico")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Servico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Nome;
	private String Fornecedor;
	private float Valor;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario Usuario;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getFornecedor() {
		return Fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}

	public float getValor() {
		return Valor;
	}

	public void setValor(float valor) {
		Valor = valor;
	}

	@Override
	public String toString() {
		return Id + ";" + Nome + ";" + Fornecedor + ";" + Valor; 
	}
}
