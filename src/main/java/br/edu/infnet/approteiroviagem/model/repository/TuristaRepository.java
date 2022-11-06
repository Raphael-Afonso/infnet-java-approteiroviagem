package br.edu.infnet.approteiroviagem.model.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.approteiroviagem.model.domain.Turista;

@Repository
public interface TuristaRepository extends CrudRepository<Turista, Integer>{

}
