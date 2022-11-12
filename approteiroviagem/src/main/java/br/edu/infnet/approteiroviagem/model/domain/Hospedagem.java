package br.edu.infnet.approteiroviagem.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_hospedagem")
public class Hospedagem extends Servico {
	private int estrelas;
	private int totalQuartos;
	private String empresa;
		
	public int getEstrelas() {
		return estrelas;
	}
	
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}

	public int getTotalQuartos() {
		return totalQuartos;
	}

	public void setTotalQuartos(int totalQuartos) {
		this.totalQuartos = totalQuartos;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + estrelas + ";" + totalQuartos + ";" + empresa;
	}
}