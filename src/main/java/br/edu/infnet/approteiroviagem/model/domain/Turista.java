package br.edu.infnet.approteiroviagem.model.domain;

public class Turista {
	private int Id;
	private String Nome;
	private String Cpf;
	private String Email;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
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
		return Id + ";" + Nome + ";" + Cpf + ";" + Email;
	}
}