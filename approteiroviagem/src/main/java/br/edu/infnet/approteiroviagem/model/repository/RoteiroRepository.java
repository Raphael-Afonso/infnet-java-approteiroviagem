package br.edu.infnet.approteiroviagem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.approteiroviagem.model.domain.Roteiro;

@Repository
public interface RoteiroRepository extends CrudRepository<Roteiro, Integer>{
	@Query("from Roteiro r where r.usuario.id =:idUsuario")
	List<Roteiro> obterLista(Integer idUsuario);
}
