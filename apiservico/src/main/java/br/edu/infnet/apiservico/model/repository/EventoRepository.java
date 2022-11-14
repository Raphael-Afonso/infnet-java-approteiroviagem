package br.edu.infnet.apiservico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiservico.model.domain.Evento;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Integer>{
	@Query("from Evento e where e.usuario.id =:idUsuario")
	List<Evento> obterLista(Integer idUsuario);
}
