package br.edu.infnet.approteiroviagem.model.domain;

import java.time.LocalDateTime;

public class Roteiro {
	public String Descricao;
	public LocalDateTime Data;
	public boolean Internacional;
	
	@Override
	public String toString() {
		return Descricao + ";" + Data + ";" + Internacional;
	}
}