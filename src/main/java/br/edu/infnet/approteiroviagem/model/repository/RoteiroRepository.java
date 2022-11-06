package br.edu.infnet.approteiroviagem.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.approteiroviagem.model.domain.Roteiro;

@Repository
public interface RoteiroRepository extends CrudRepository<Roteiro, Integer>{

}
