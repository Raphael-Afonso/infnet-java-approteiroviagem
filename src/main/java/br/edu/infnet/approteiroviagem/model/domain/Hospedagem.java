package br.edu.infnet.approteiroviagem.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_hospedagem")
public class Hospedagem extends Servico {
	private int Estrelas;
	private int TotalQuartos;
	private String Empresa;
	
	public int getEstrelas() {
		return Estrelas;
	}

	public void setEstrelas(int estrelas) {
		Estrelas = estrelas;
	}

	public int getTotalQuartos() {
		return TotalQuartos;
	}

	public void setTotalQuartos(int totalQuartos) {
		TotalQuartos = totalQuartos;
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + Estrelas + ";" + TotalQuartos + ";" + Empresa;
	}
}