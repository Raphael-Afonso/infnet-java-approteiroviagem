package br.edu.infnet.apiservico.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiservico.model.domain.Transporte;

@Repository
public interface TransporteRepository extends CrudRepository<Transporte, Integer>{
	@Query("from Transporte t where t.usuario.id =:idUsuario")
	List<Transporte> obterLista(Integer idUsuario);
}
