package br.edu.infnet.apiservico.model.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_evento")
public class Evento extends Servico {
	private boolean openBar;
	private int duracao;
	private String local;

	public boolean isOpenBar() {
		return openBar;
	}

	public void setOpenBar(boolean openBar) {
		this.openBar = openBar;
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
		return super.toString() + ";" + openBar + ";" + duracao + ";" + local;
	}
}
