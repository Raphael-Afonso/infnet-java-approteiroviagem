package br.edu.infnet.approteiroviagem.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Nome;
	private String email;
	private String Senha;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Turista> Turistas;

	@Override
	public String toString() {
		return Id + ";" + Nome + ";" + Senha + ";" + email;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}
	
	public List<Turista> getTuristas() {
		return Turistas;
	}

	public void setTuristas(List<Turista> turistas) {
		Turistas = turistas;
	}
}