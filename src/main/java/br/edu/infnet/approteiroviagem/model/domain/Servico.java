package br.edu.infnet.approteiroviagem.model.domain;

public abstract class Servico {
	private int Id;
	private String Nome;
	private int Codigo;
	private float Valor;
	
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

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public float getValor() {
		return Valor;
	}

	public void setValor(float valor) {
		Valor = valor;
	}

	@Override
	public String toString() {
		return Id + ";" + Nome + ";" + Codigo + ";" + Valor; 
	}
}
