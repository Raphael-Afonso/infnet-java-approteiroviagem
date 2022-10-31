package br.edu.infnet.approteiroviagem.model.domain;

public class Turista {
	private String Nome;
	private String Cpf;
	private String Email;
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return Nome + ";" + Cpf + ";" + Email;
	}
}