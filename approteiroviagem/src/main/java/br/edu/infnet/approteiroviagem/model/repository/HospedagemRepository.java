package br.edu.infnet.approteiroviagem.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.approteiroviagem.model.domain.Hospedagem;

@Repository
public interface HospedagemRepository extends CrudRepository<Hospedagem, Integer>{

}
