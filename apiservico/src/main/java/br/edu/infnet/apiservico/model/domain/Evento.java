package br.edu.infnet.apiservico.model.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_evento")
public class Evento extends Servico {
	private LocalDateTime horario;
	private int duracao;
	private String local;
	
	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + horario + ";" + duracao + ";" + local;
	}
}
