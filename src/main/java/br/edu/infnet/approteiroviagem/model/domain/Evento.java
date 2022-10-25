package br.edu.infnet.approteiroviagem.model.domain;

import java.time.LocalDateTime;

public class Evento extends Servico {
	public LocalDateTime Horario;
	public int Duracao;
	public String Local;
	
	@Override
	public String toString() {
		return super.toString() + ";" + Horario + ";" + Duracao + ";" + Local;
	}
}
