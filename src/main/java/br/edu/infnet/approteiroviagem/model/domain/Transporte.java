package br.edu.infnet.approteiroviagem.model.domain;

public class Transporte extends Servico {
	public String Veiculo;
	public String EnderecoEmbarque;
	public String EnderecoDesembarque;
	
	@Override
	public String toString() {
		return super.toString() + ";" + Veiculo + ";" + EnderecoEmbarque + ";" + EnderecoDesembarque;
	}
}
