package br.edu.infnet.approteiroviagem.model.domain;

public class Turista {
	public String Nome;
	public String Cpf;
	public String Email;
	
	@Override
	public String toString() {
		return Nome + ";" + Cpf + ";" + Email;
	}
}