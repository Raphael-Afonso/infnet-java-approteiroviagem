package br.edu.infnet.approteiroviagem.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_transporte")
public class Transporte extends Servico {
	private String Veiculo;
	private String EnderecoEmbarque;
	private String EnderecoDesembarque;
		
	public String getVeiculo() {
		return Veiculo;
	}

	public void setVeiculo(String veiculo) {
		Veiculo = veiculo;
	}

	public String getEnderecoEmbarque() {
		return EnderecoEmbarque;
	}

	public void setEnderecoEmbarque(String enderecoEmbarque) {
		EnderecoEmbarque = enderecoEmbarque;
	}

	public String getEnderecoDesembarque() {
		return EnderecoDesembarque;
	}

	public void setEnderecoDesembarque(String enderecoDesembarque) {
		EnderecoDesembarque = enderecoDesembarque;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + Veiculo + ";" + EnderecoEmbarque + ";" + EnderecoDesembarque;
	}
}
