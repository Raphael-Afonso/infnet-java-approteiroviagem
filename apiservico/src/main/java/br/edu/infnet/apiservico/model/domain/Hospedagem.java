package br.edu.infnet.apiservico.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_hospedagem")
public class Hospedagem extends Servico {
	private int estrelas;
	private int totalQuartos;
	private boolean cafeIncluso;
		
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

	public boolean isCafeIncluso() {
		return cafeIncluso;
	}

	public void setCafeIncluso(boolean cafeIncluso) {
		this.cafeIncluso = cafeIncluso;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + estrelas + ";" + totalQuartos + ";" + cafeIncluso;
	}
}