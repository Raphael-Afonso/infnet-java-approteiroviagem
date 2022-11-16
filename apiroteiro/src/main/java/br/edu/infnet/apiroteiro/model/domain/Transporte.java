package br.edu.infnet.apiroteiro.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_transporte")
public class Transporte extends Servico {
	private String veiculo;
	private String enderecoEmbarque;
	private String enderecoDesembarque;
		
	@Override
	public String toString() {
		return super.toString() + ";" + veiculo + ";" + enderecoEmbarque + ";" + enderecoDesembarque;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getEnderecoEmbarque() {
		return enderecoEmbarque;
	}

	public void setEnderecoEmbarque(String enderecoEmbarque) {
		this.enderecoEmbarque = enderecoEmbarque;
	}

	public String getEnderecoDesembarque() {
		return enderecoDesembarque;
	}

	public void setEnderecoDesembarque(String enderecoDesembarque) {
		this.enderecoDesembarque = enderecoDesembarque;
	}
}
