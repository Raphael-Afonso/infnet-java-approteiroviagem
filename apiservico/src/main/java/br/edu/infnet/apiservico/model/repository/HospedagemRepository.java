package br.edu.infnet.apiservico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiservico.model.domain.Hospedagem;

@Repository
public interface HospedagemRepository extends CrudRepository<Hospedagem, Integer>{
	@Query("from Hospedagem h where h.usuario.id =:idUsuario")
	List<Hospedagem> obterLista(Integer idUsuario);
}
