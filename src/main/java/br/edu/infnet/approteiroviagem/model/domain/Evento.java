package br.edu.infnet.approteiroviagem.model.domain;

import java.time.LocalDateTime;

public class Evento extends Servico {
	private LocalDateTime Horario;
	private int Duracao;
	private String Local;
	
	public LocalDateTime getHorario() {
		return Horario;
	}

	public void setHorario(LocalDateTime horario) {
		Horario = horario;
	}

	public int getDuracao() {
		return Duracao;
	}

	public void setDuracao(int duracao) {
		Duracao = duracao;
	}

	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		Local = local;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + Horario + ";" + Duracao + ";" + Local;
	}
}
