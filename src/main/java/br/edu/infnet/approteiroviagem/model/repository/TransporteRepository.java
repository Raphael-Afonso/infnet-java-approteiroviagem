package br.edu.infnet.approteiroviagem.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.approteiroviagem.model.domain.Transporte;

@Repository
public interface TransporteRepository extends CrudRepository<Transporte, Integer>{

}
