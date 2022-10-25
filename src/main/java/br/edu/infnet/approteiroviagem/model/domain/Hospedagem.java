package br.edu.infnet.approteiroviagem.model.domain;

public class Hospedagem extends Servico {
	public int Estrelas;
	public int TotalQuartos;
	public String Empresa;
	
	@Override
	public String toString() {
		return super.toString() + ";" + Estrelas + ";" + TotalQuartos + ";" + Empresa;
	}
}