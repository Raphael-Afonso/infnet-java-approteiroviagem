package br.edu.infnet.approteiroviagem.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Roteiro { //Pedido
	private String Descricao;
	private LocalDateTime Data;
	private boolean Internacional;
	private Turista Turista;
	private List<Servico> Servicos;
	
	public Roteiro() {
		Data = LocalDateTime.now();
		Internacional = false;
	}
	
	public Roteiro(Turista turista) {
 		this();
		Turista = turista;
	}
	
	public List<Servico> getServicos() {
		return Servicos;
	}

	public void setServicos(List<Servico> servicos) {
		Servicos = servicos;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public boolean isInternacional() {
		return Internacional;
	}
	
	public Turista getTurista() {
		return Turista;
	}
	
	public void setInternacional(boolean internacional) {
		Internacional = internacional;
	}
	
	public LocalDateTime getData() {
		return Data;
	}

	@Override
	public String toString() {
		return Descricao + ";" + Data + ";" + Internacional + ";" + Turista + ";" + Servicos.size();
	}
}