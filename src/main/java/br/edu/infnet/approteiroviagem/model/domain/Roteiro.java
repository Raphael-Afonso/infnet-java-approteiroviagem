package br.edu.infnet.approteiroviagem.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "t_roteiro")
public class Roteiro { //Pedido
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Descricao;
	private LocalDateTime Data;
	private boolean Internacional;

	@Transient
	private Turista Turista;
	@Transient
	private List<Servico> Servicos;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public Roteiro() {
		Data = LocalDateTime.now();
		Internacional = false;
	}
	
	public Roteiro(Turista turista) {
 		this();
		Turista = turista;
	}
	
	public List<Servico> getServicos() {
		return Servicos;
	}

	public void setServicos(List<Servico> servicos) {
		Servicos = servicos;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public boolean isInternacional() {
		return Internacional;
	}
	
	public Turista getTurista() {
		return Turista;
	}
	
	public void setInternacional(boolean internacional) {
		Internacional = internacional;
	}
	
	public LocalDateTime getData() {
		return Data;
	}

	@Override
	public String toString() {
		return Id + ";" + Descricao + ";" + Data + ";" + Internacional + ";" + Turista + ";" + Servicos.size();
	}
}